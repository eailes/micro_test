package com.example.persistence.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.math.BigDecimal;

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
    String name, corp, secStatus, bloodLine;
    BigDecimal wallet;
}
