package com.example.persistence.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Ean on 2/17/2017.
 */
@Entity
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class InvCategories {
    @Id private int categoryId;
    private String categoryName;
    private Integer iconId;
    private Boolean published;
}
