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
public class ChrAncestries {
    @Id private int ancestryId;
    private String ancestryName, description, shortDescription;
    private Integer perception, willpower, charisma, memory, intelligence, iconId;
    @OneToOne
    @JoinColumn(name = "bloodline_id")
    private ChrBloodlines bloodline;
}
