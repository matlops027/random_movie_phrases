package com.movies.phrase.model.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "frases")
public class Frase {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        Long id;
        String descricao;
        @ManyToOne(fetch = FetchType.EAGER)
        Filme filme;
        @ManyToOne(fetch = FetchType.EAGER)
        Personagem personagem;

        public Long getId() {
                return id;
        }

        public String getDescricao() {
                return descricao;
        }

        public Filme getFilme() {
                return filme;
        }

        public Personagem getPersonagem() {
                return personagem;
        }
}
