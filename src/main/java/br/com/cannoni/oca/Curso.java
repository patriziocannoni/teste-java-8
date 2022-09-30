package br.com.cannoni.oca;

import java.time.LocalDate;
import java.time.Period;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
public class Curso {

    @Getter
    @NonNull
    private String nome;
    
    @Getter
    @NonNull
    private Integer alunos;

    @Getter
    @Setter
    private LocalDate inicio;

    @Getter
    @Setter
    private LocalDate fim;

    public Period getDuracao() {
        return Period.between(fim, inicio);
    }

}
