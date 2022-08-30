package br.com.cannoni.oca;

import java.time.LocalDate;
import java.time.Period;

import lombok.Getter;
import lombok.Setter;

public class Curso {

    @Getter
    private String nome;
    
    @Getter
    private int alunos;

    @Getter
    @Setter
    private LocalDate inicio;

    @Getter
    @Setter
    private LocalDate fim;

    public Curso(String nome, int alunos) {
        this.nome = nome;
        this.alunos = alunos;
    }

    public Period getDuracao() {
        return Period.between(fim, inicio);
    }

}
