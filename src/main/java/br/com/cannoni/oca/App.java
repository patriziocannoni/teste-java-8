package br.com.cannoni.oca;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class App {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<>();
        palavras.add("alura online");
        palavras.add("casa do código");
        palavras.add("caelum");

        Comparator<String> c = (s1, s2) -> Integer.compare(s1.length(), s2.length());

        Comparator<String> c1 = Comparator.comparing(s -> s.length());

        Function<String, Integer> f = s -> s.length();        
        Comparator<String> c2 = Comparator.comparing(f);

        Comparator<String> c3 = Comparator.comparing(String::length);
        
        palavras.sort(c1);

        palavras.forEach(s -> System.out.println(s));

        new Thread(() -> System.out.println("Executando um Runnable")).start();
    }
    
}
