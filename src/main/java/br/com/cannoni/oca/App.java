package br.com.cannoni.oca;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class App {
    
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<>();
        palavras.add("alura online");
        palavras.add("casa do código");
        palavras.add("caelum");
        
        palavras.sort(Comparator.comparing(String::length));
        palavras.forEach(System.out::println);

        System.out.println("----");

        palavras.sort(Comparator.naturalOrder());
        palavras.forEach(System.out::println);

        System.out.println("----");

        palavras.stream().filter(s -> s.length() > 6).forEach(System.out::println);
    }
    
}
