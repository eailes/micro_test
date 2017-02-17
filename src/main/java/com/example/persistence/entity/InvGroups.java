package com.example.persistence.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * User: eailes
 * Created: 2/15/17
 * Time: 9:46 AM
 * Project: micro_test
 */
@Entity
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class InvGroups {
    @Id private int groupId;
    private Integer categoryId, iconId;
    private String groupName;
    private Boolean useBasePrice, anchored, anchorable, fittableNonSingleton, published;
}
