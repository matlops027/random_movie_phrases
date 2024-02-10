package com.movies.phrase.model.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "filmes")
public class Filme {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        Long id;
        String titulo;
        String poster;
        @ManyToMany
        @JoinTable(name = "filmes_personagens",
                joinColumns = @JoinColumn(name = "filme_id"),
                inverseJoinColumns = @JoinColumn(name = "personagem_id"))
        List<Personagem> personagens;
        @OneToMany(mappedBy = "filme")
        List<Frase> frases;

        public Long getId() {
                return id;
        }

        public String getTitulo() {
                return titulo;
        }

        public String getPoster() {
                return poster;
        }

        public List<Personagem> getPersonagens() {
                return personagens;
        }

        public List<Frase> getFrases() {
                return frases;
        }
}
