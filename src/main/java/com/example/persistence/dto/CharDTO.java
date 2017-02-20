package com.example.persistence.dto;

import com.example.persistence.entity.ChrAncestries;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.OffsetDateTime;

/**
 * User: eailes
 * Created: 2/15/17
 * Time: 4:46 PM
 * Project: micro_test
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
public class CharDTO implements Serializable{
    private String name, birthDate, corpName, corpTicker, allianceName, allianceTicker, allianceFounded, expires;
    private Integer corpId, allianceId, characterId, corpMembers;
    private ChrAncestries ancestry;
    private BigDecimal balance;


}
