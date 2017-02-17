package com.example.persistence.entity;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.scheduling.annotation.Async;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

/**
 * User: eailes
 * Created: 1/16/17
 * Time: 6:23 PM
 * Project: micro_test
 */
public interface CharacterRepository extends CrudRepository<Character,Long> {
    <S extends Character> S save(S character);
    Optional<Character> findByCharacterName(String characterName);

    default Optional<Character> findByCharacter(Character character) {
        return findByCharacterName(character == null ? null : character.getCharacterName());
    }

    Iterable<Character> findAllByUserId(int id);

    @Query("select c from Character c")
    Stream<Character> streamAllCharacters();

    @Async
    CompletableFuture<List<Character>> readAllBy();
}
