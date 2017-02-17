package com.example.persistence.entity;

import org.springframework.data.repository.CrudRepository;

/**
 * User: eailes
 * Created: 2/8/17
 * Time: 5:06 PM
 * Project: micro_test
 */

public interface InvTypesRepository extends CrudRepository<InvTypes,Integer> {
    Iterable<Character> findAllByTypeId(int id);
}
