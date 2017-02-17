package com.example.controller;

import com.example.esi.ApiClient;
import com.example.esi.ApiException;
import com.example.esi.api.SsoApi;
import com.example.esi.auth.CharacterInfo;
import com.example.esi.auth.OAuth;
import com.example.esi.auth.SsoScopes;
import com.example.persistence.entity.Character;
import com.example.persistence.entity.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;
import java.util.*;
import java.util.function.Supplier;

/**
 * User: eailes
 * Created: 1/16/17
 * Time: 12:42 PM
 * Project: micro_test
 */

@Controller
public class AuthController {

    private final CharacterRepository characterRepository;

    @Autowired
    public AuthController(CharacterRepository characterRepository) {
        this.characterRepository = characterRepository;
    }

    @Value("${auth.client.id}")
    private String clientID;

    @Value("${auth.secret.key}")
    private String secretKey;

    @Value("${auth.callback.url}")
    private String callbackUrl;

    private List<AbstractMap.SimpleEntry<String, ApiClient>> authList = new ArrayList<>();

    @RequestMapping(value = "/login/eve")
    public String doRefresh(@RequestParam(value = "code") String code, @RequestParam(value = "state") String state, HttpServletResponse response){
        final ApiClient client = getClient(state);
        if(client==null){
            return "ERROR: client";
        }
        final OAuth auth = (OAuth) client.getAuthentication("evesso");
        auth.finishFlow(code,state);


        final SsoApi api = new SsoApi(client);
        CharacterInfo info = null;
        try {
            info = api.getCharacterInfo();
        } catch (ApiException e) {
            return e.getResponseBody();
        }

        Optional<Character> character = characterRepository.findByCharacterName(info.getCharacterName());
        if(character.isPresent()){
            Character c = character.get();
            c.update(info,auth.getRefreshToken(),1);
            characterRepository.save(c);
        }else{
            characterRepository.save(new Character(info,auth.getRefreshToken(),1));
        }

        response.setHeader("token", auth.getRefreshToken());
        return "redirect:http://localhost:3000/calc" ;
    }

    private void updateChar(Character character){
        characterRepository.save(character);

    }

    @RequestMapping(value = "/auth/request/")
    public String requestAuth(){
        final String state = UUID.randomUUID().toString();
        final ApiClient client = new ApiClient();
        final OAuth auth = (OAuth) client.getAuthentication("evesso");
        auth.setClientId(clientID);
        auth.setClientSecret(secretKey);

        final Set<String> scopes = new HashSet<>(Arrays.asList(SsoScopes.ALL));
        final String authorizationUri = auth.getAuthorizationUri(callbackUrl, scopes, state);

        authList.add(new AbstractMap.SimpleEntry<>(state,client));
        return "redirect:" +authorizationUri;
    }

    private ApiClient getClient(String state){
        ApiClient client = null;
        Iterator<AbstractMap.SimpleEntry<String,ApiClient>> itr = authList.iterator();
        while(itr.hasNext()){
            AbstractMap.SimpleEntry entry = itr.next();
            if(state.equals(entry.getKey())){
                client = (ApiClient) entry.getValue();
                itr.remove();
                break;
            }
        }
        return client;
    }
}
