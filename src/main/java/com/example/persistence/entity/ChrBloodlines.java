package com.example.persistence.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 * Created by Ean on 2/17/2017.
 */
@Entity
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ChrBloodlines {
    @Id
    private int bloodlineId;
    private String bloodlineName, description, maleDescription, femaleDescription, shortDescription, shortMaleDescription, shortFemaleDescription;
    private Integer shipTypeId, corporationId, perception, willpower, charisma, memory, intelligence, iconId;
    @OneToOne
    @JoinColumn(name = "race_id")
    private ChrRaces race;
}
