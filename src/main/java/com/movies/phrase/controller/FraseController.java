package com.movies.phrase.controller;

import com.movies.phrase.model.dto.FraseDTO;
import com.movies.phrase.model.services.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/series")
public class FraseController {

    @Autowired
    FraseService fraseService;

    @GetMapping("/frases")
    public FraseDTO getFrases() {
        return fraseService.getFrases();
    }

}
