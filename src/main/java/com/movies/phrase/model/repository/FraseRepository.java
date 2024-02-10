package com.movies.phrase.model.repository;

import com.movies.phrase.model.entities.Frase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface FraseRepository extends JpaRepository<Frase, Long> {
    @Query("SELECT f FROM Frase f JOIN f.filme JOIN f.personagem ORDER BY RANDOM() LIMIT 1")
    Optional<Frase> getFrases();
}
