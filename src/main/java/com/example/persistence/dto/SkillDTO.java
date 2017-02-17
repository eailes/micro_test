package com.example.persistence.dto;

import com.example.esi.model.Skill;
import com.example.persistence.entity.InvTypes;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * User: eailes
 * Created: 2/8/17
 * Time: 6:37 PM
 * Project: micro_test
 */
@Getter
@Setter
@ToString
public class SkillDTO {
    private Skill skill;
    private InvTypes invType;
}
