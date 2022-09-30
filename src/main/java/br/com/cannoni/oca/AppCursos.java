package br.com.cannoni.oca;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AppCursos {

    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<>();
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 113));
        cursos.add(new Curso("C", 55));

        cursos.sort(Comparator.comparingInt(Curso::getAlunos));

        cursos.forEach(c -> System.out.println(c.getNome()));

        System.out.println("----");

        cursos.stream().filter(c -> c.getAlunos() > 50).forEach(c -> System.out.println(c.getNome()));

        System.out.println("----");

        cursos.stream().mapToInt(Curso::getAlunos).forEach(System.out::println);

        cursos.stream().mapToInt(Curso::getAlunos).average();

        cursos.stream().filter(c -> c.getAlunos() > 50).toList();

        System.out.println("----");

        Curso curso1 = new Curso("Curso 1", 50);
        curso1.setInicio(LocalDate.of(2022, 10, 01));
        curso1.setFim(LocalDate.of(2022, 12, 03));

        Period duracao = curso1.getDuracao();

        System.out.println(duracao);

        System.out.println("----");

        LocalDate agora = LocalDate.now();
        System.out.println(agora);

        LocalDate futuro = LocalDate.of(2099, 1, 25);
        System.out.println(futuro);

        Period periodo = Period.between(agora, futuro);
        System.out.println(periodo);

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(formatador.format(agora));
    }

}
