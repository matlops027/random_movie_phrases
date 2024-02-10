package com.movies.phrase.model.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "personagens")
public class Personagem {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        Long id;
        String nome;
        @ManyToMany(mappedBy = "personagens")
        List<Filme> filmes;
        @OneToMany(mappedBy = "personagem")
        List<Frase> frases;

        public Long getId() {
                return id;
        }

        public String getNome() {
                return nome;
        }

        public List<Filme> getFilmes() {
                return filmes;
        }

        public List<Frase> getFrases() {
                return frases;
        }
}
