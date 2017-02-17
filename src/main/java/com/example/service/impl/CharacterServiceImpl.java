package com.example.service.impl;

import com.example.esi.ApiClient;
import com.example.esi.ApiException;
import com.example.esi.api.*;
import com.example.esi.auth.OAuth;
import com.example.esi.model.*;
import com.example.persistence.dto.CharDTO;
import com.example.persistence.dto.SkillDTO;
import com.example.persistence.entity.Character;
import com.example.persistence.entity.CharacterRepository;
import com.example.persistence.entity.InvTypes;
import com.example.persistence.entity.InvTypesRepository;
import com.example.service.CharacterService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * User: eailes
 * Created: 2/8/17
 * Time: 12:15 PM
 * Project: micro_test
 */

@Component
public class CharacterServiceImpl implements CharacterService {

    private static final Logger log = LoggerFactory.getLogger(CharacterServiceImpl.class);

    private CharacterRepository characterRepository;
    private InvTypesRepository invTypesRepository;

    private String DATASOURCE = "tranquility";

    @Value("${auth.client.id}")
    private String clientID;

    @Value("${auth.secret.key}")
    private String secretKey;

    @Autowired
    public CharacterServiceImpl(CharacterRepository characterRepository, InvTypesRepository invTypesRepository) {
        this.characterRepository = characterRepository;
        this.invTypesRepository = invTypesRepository;
    }

    @Override
    public List<CharacterAssetsResponse> getCharacterAssets(String name) throws Exception {
        Character character = getCharacter(name);
        ApiClient client = getClient(character.getRefreshToken());
        return new AssetsApi(client).getCharactersCharacterIdAssets(character.getCharacterId(),DATASOURCE);
    }

    @Override
    public CharacterLocationResponse getCharacterLocation(String name) throws Exception {
        Character character = getCharacter(name);
        ApiClient client = getClient(character.getRefreshToken());
        return new LocationApi(client).getCharactersCharacterIdLocation(character.getCharacterId(),DATASOURCE);
    }

    @Override
    public CharacterShipResponse getCharacterShip(String name) throws Exception {
        Character character = getCharacter(name);
        ApiClient client = getClient(character.getRefreshToken());
        return new LocationApi(client).getCharactersCharacterIdShip(character.getCharacterId(),DATASOURCE);
    }

    @Override
    public CharacterClonesResponse getCharacterClone(String name) throws Exception {
        Character character = getCharacter(name);
        ApiClient client = getClient(character.getRefreshToken());

        return new ClonesApi(client).getCharactersCharacterIdClones(character.getCharacterId(),DATASOURCE);
    }

    @Override
    public List<SkillDTO> getCharacterSkills(String name) throws Exception {
        Character character = getCharacter(name);
        ApiClient client = getClient(character.getRefreshToken());

        List<SkillDTO> skills = new ArrayList<>();
        //Iterable<InvTypes> invTypes = invTypesRepository.findAll();
        CharacterSkillsResponse skillsResponse = new SkillsApi(client).getCharactersCharacterIdSkills(character.getCharacterId(), DATASOURCE);
        for(Skill skill : skillsResponse.getSkills()){
            SkillDTO dto = new SkillDTO();
            dto.setSkill(skill);
            InvTypes invType = invTypesRepository.findOne(skill.getSkillId());
            dto.setInvType(invType);
            skills.add(dto);
        }

        return skills;
    }

    @Override
    public CharacterPortraitResponse getCharacterPortrait(String name) throws Exception{
        Character character = getCharacter(name);
        ApiClient client = getClient(character.getRefreshToken());
        return new CharacterApi(client).getCharactersCharacterIdPortrait(character.getCharacterId(), DATASOURCE);
    }

    @Override
    public List<MarketOrdersResponse> getCharacterCitadelPrices(String name) throws Exception {
        Character character = getCharacter(name);
        ApiClient client = getClient(character.getRefreshToken());

        CharacterSearchResponse searchResponse = new SearchApi(client).getCharactersCharacterIdSearch(character.getCharacterId(),"perimeter", Collections.singletonList("structure"),"en-us",false,DATASOURCE);
        List<MarketOrdersResponse> marketOrdersResponses = new ArrayList<>();
        for(Long structure : searchResponse.getStructure()){
            try{
                marketOrdersResponses.addAll(new MarketApi(client).getMarketsStructureOrders(structure,DATASOURCE));
            }catch (ApiException x){
                log.info(x.getResponseBody());
            }
        }
        return marketOrdersResponses;
    }

    @Override
    public List<CharacterWalletsResponse> getCharacterWallet(String name) throws Exception {
        Character character = getCharacter(name);
        ApiClient client = getClient(character.getRefreshToken());

        List<CharacterWalletsResponse> walletsResponses = new WalletApi(client).getCharactersCharacterIdWallets(character.getCharacterId(),DATASOURCE);

        return walletsResponses;
    }



    @Override
    public CharDTO getCharacterPublicInfo(String name) throws Exception {
        Character character = getCharacter(name);
        ApiClient client = getClient(character.getRefreshToken());

        CharacterResponse characterResponse = new CharacterApi(client).getCharactersCharacterId(character.getCharacterId(),DATASOURCE);
        CorporationResponse corporationResponse = new CorporationApi(client).getCorporationsCorporationId(characterResponse.getCorporationId(),DATASOURCE);


        return null;
    }

    private Character getCharacter(String name) throws Exception{
        Character character;
        Optional<Character> oCharacter = characterRepository.findByCharacterName(name);
        if(oCharacter.isPresent()){
            character = oCharacter.get();
        }else{
            String error = String.format("The character \"%s\" could not be found.", name);
            throw new Exception(error);
        }

        return character;
    }

    private ApiClient getClient(String refreshTkn) throws Exception {
        ApiClient client = new ApiClient();
        OAuth auth = (OAuth) client.getAuthentication("evesso");
        auth.setClientId(clientID);
        auth.setClientSecret(secretKey);
        auth.setRefreshToken(refreshTkn);

        return client;
    }
}
