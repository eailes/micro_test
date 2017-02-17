package com.example.persistence.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * User: eailes
 * Created: 2/14/17
 * Time: 6:47 PM
 * Project: micro_test
 */
@Entity
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class InvTypes {

    @Id private int typeId;
    private Integer raceId, portionSize, marketGroupId, iconId, soundId, graphicId;
    private String typeName, description;
    private Double mass, volume, capacity;
    private BigDecimal basePrice;
    private Boolean published;
    @OneToOne
    @JoinColumn(name = "group_id")
    private InvGroups group;


}
