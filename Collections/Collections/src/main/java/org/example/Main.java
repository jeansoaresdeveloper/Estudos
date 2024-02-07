package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(10);
        numeros.add(23);
        numeros.add(12);
        numeros.add(10);


        Integer ordenado = numeros.stream().reduce(0, Integer::sum);
        System.out.println(ordenado);

        List<String> myList =
                Arrays.asList("a1", "a2", "b1", "c2", "c1");

        myList.stream()
                .filter(s -> s.startsWith("c"))
                .map(s -> s.toUpperCase(Locale.getDefault()))
                .sorted(((o1, o2) -> Integer.compare(o2.length(), o1.length())))
                .forEach(System.out::println);

    }
}