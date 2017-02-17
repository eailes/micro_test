package com.example.controller;

import com.example.esi.model.*;
import com.example.persistence.dto.CharDTO;
import com.example.persistence.dto.SkillDTO;
import com.example.persistence.entity.Character;
import com.example.persistence.entity.CharacterRepository;
import com.example.service.CharacterService;
import com.example.service.CorporationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.*;

/**
 * User: eailes
 * Created: 2/7/17
 * Time: 1:44 PM
 * Project: micro_test
 */
@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
@RestController
public class CharactersController {
    private final CharacterRepository characterRepository;
    private final CharacterService characterService;
    private final CorporationService corporationService;

    @Autowired
    public CharactersController(CharacterRepository characterRepository, CharacterService characterService, CorporationService corporationService) {
        this.characterRepository = characterRepository;
        this.characterService = characterService;
        this.corporationService = corporationService;
    }

    @RequestMapping(value = "/characters/user/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getCharactersForUser(@PathVariable int id){
        String errorMsg = String.format("Characters for user %03d could not be found",id);
        Iterable<Character> characters = characterRepository.findAllByUserId(id);
        List<Character> target = new ArrayList<>();
        characters.forEach(target::add);
        return !target.isEmpty() ? new ResponseEntity<>(target,HttpStatus.OK) : ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new Error(HttpStatus.BAD_REQUEST.value(),errorMsg));
    }

    @RequestMapping(value = "/character/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getCharacterByName(@PathVariable String name){
        String errorMsg = "A character with that name could not be found.";
        Optional<Character> character = characterRepository.findByCharacterName(name);
        return character.isPresent() ? new ResponseEntity<>(character.get(),HttpStatus.OK) : ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new Error(HttpStatus.BAD_REQUEST.value(),errorMsg));
    }



    @RequestMapping(value = "/character/{name}/id", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getCharacterIdByName(@PathVariable String name){
        String errorMsg = "A character with that name could not be found.";
        Optional<Character> character = characterRepository.findByCharacterName(name);
        return character.isPresent() ? new ResponseEntity<>(character.get().getCharacterId(),HttpStatus.OK) : ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new Error(HttpStatus.BAD_REQUEST.value(),errorMsg));
    }

    @RequestMapping(value = "/character/{name}/portrait", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getCharacterImgByName(@PathVariable String name){
        String errorMsg = null;
        CharacterPortraitResponse response = null;
        try {
            response = characterService.getCharacterPortrait(name);
        } catch (Exception e) {
            errorMsg = e.getMessage();
        }

        return response != null ? ResponseEntity.status(HttpStatus.OK).body(response) : ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new Error(HttpStatus.BAD_REQUEST.value(),errorMsg));
    }

    @RequestMapping(value = "/character/{name}/assets", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<CharacterAssetsResponse> getCharacterAssets(@PathVariable String name) throws Exception {
        return characterService.getCharacterAssets(name);
    }

    @RequestMapping(value = "/character/{name}/public", produces = MediaType.APPLICATION_JSON_VALUE)
    public CharDTO getCharacterPublicInfo(@PathVariable String name) throws Exception {
        return characterService.getCharacterPublicInfo(name);
    }

    @RequestMapping(value = "/character/{name}/skills", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<SkillDTO> getCharacterSkills(@PathVariable String name) throws Exception {
        return characterService.getCharacterSkills(name);
    }

    @RequestMapping(value = "/character/{name}/prices")
    public List<MarketOrdersResponse> getCitadelPricesForCharacter(@PathVariable String name) throws Exception {
        return characterService.getCharacterCitadelPrices(name);
    }

    @RequestMapping(value = "/character/{name}/clones")
    public CharacterClonesResponse getCharacterClones(@PathVariable String name) throws Exception {
        return characterService.getCharacterClone(name);
    }

    @RequestMapping(value = "/character/{name}/location")
    public CharacterLocationResponse getCharacterCorp(@PathVariable String name) throws Exception {
        return characterService.getCharacterLocation(name);
    }

    @RequestMapping(value = "/character/{name}/wallets")
    public Map<?,?> getCharacterWallets(@PathVariable String name) throws Exception {
        Map wallet = new HashMap();
        BigDecimal balance = BigDecimal.valueOf(characterService.getCharacterWallet(name).get(0).getBalance());
        wallet.put("balance",balance);
        return wallet;
    }
}
