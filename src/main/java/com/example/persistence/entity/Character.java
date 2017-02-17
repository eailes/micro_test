package com.example.persistence.entity;

import com.example.esi.auth.CharacterInfo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;


/**
 * User: eailes
 * Created: 1/16/17
 * Time: 6:14 PM
 * Project: micro_test
 */
@Entity
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Character extends AbstractEntity{

    int characterId, userId;

    String characterName, TokenType, CharacterOwnerHash, intellectualProperty, refreshToken;
    @Column(length=1500)
    String scopes;
    LocalDateTime expiresOn;



    public Character(CharacterInfo info, String refreshToken, int userId) {
        this.characterId = info.getCharacterId();
        this.userId = userId;
        this.characterName = info.getCharacterName();
        this.scopes = info.getScopes();
        this.TokenType = info.getTokenType();
        this.CharacterOwnerHash = info.getCharacterOwnerHash();
        this.intellectualProperty = info.getIntellectualProperty();
        this.refreshToken = refreshToken;

        Date ts = info.getExpiresOn();
        Instant instant = Instant.ofEpochMilli(ts.getTime());
        this.expiresOn = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
    }

    public void update(CharacterInfo info, String refreshToken, int userId){
        this.characterId = info.getCharacterId();
        this.userId = userId;
        this.characterName = info.getCharacterName();
        this.scopes = info.getScopes();
        this.TokenType = info.getTokenType();
        this.CharacterOwnerHash = info.getCharacterOwnerHash();
        this.intellectualProperty = info.getIntellectualProperty();
        this.refreshToken = refreshToken;

        Date ts = info.getExpiresOn();
        Instant instant = Instant.ofEpochMilli(ts.getTime());
        this.expiresOn = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
    }
}
