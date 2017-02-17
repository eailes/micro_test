package com.example.service;

import com.example.esi.model.*;
import com.example.persistence.dto.CharDTO;
import com.example.persistence.dto.SkillDTO;
import org.jvnet.hk2.annotations.Service;

import java.util.List;

/**
 * User: eailes
 * Created: 2/8/17
 * Time: 12:15 PM
 * Project: micro_test
 */
@Service
public interface CharacterService {
    List<SkillDTO> getCharacterSkills(String name) throws Exception;
    List<CharacterAssetsResponse> getCharacterAssets(String name) throws Exception;
    CharacterLocationResponse getCharacterLocation(String name) throws Exception;
    CharacterShipResponse getCharacterShip(String name) throws Exception;
    CharacterClonesResponse getCharacterClone(String name) throws Exception;
    CharacterPortraitResponse getCharacterPortrait(String name) throws Exception;
    List<CharacterWalletsResponse> getCharacterWallet(String name) throws Exception;
    List<MarketOrdersResponse> getCharacterCitadelPrices(String name) throws Exception;
    CharDTO getCharacterPublicInfo(String name) throws Exception;
}
