package com.movies.phrase.model.services;

import com.movies.phrase.model.dto.FraseDTO;
import com.movies.phrase.model.entities.Frase;
import com.movies.phrase.model.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FraseService {

    @Autowired
    FraseRepository fraseRepository;

    public FraseDTO getFrases() {
        Optional<Frase> frase = fraseRepository.getFrases();
        if(frase.isPresent()) {
            return converteFraseDTO(frase.get());
        }
        return null;
    }

    private FraseDTO converteFraseDTO(Frase frase) {
        return new FraseDTO(frase.getId(), frase.getFilme().getTitulo(), frase.getDescricao(), frase.getPersonagem().getNome(), frase.getFilme().getPoster());
    }
}
