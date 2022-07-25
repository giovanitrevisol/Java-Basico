package br.com.gt.javacore.Zgenerics.test;


import br.com.gt.javacore.Ycolecoes.dominio.Consumidor;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    public static void main(String[] args) {
        // Type erasure
        List<String> lista = new ArrayList<>();
        lista.add("Midoriya");
        lista.add("Midoriya");


        for (String o : lista) {
            System.out.println(o);
        }
        add(lista, new Consumidor("Midoriya"));

        for (Object o : lista) {
            System.out.println(o);
        }

    }

    private static void add(List lista, Consumidor consumidor) {
        lista.add(consumidor);
    }
}
