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

        Comparator<String> c = (s1, s2) -> Integer.compare(s1.length(), s2.length());
        palavras.sort(c); 
        palavras.forEach(s -> System.out.println(s));

        new Thread(() -> System.out.println("Executando um Runnable")).start();
    }
    
}
