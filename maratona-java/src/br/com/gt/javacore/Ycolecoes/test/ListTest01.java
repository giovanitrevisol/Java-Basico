package br.com.gt.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(16);
        List<String> nomes2 = new ArrayList<>(16);
        nomes.add("Givoani");
        nomes.add("Trevisol");
        nomes2.add("Programador");
        nomes2.add("Java");

//        System.out.println(nomes.remove("william"));
        nomes.addAll(nomes2);

        for(String nome: nomes){
            System.out.println(nome);
        }

        System.out.println("--------");

        int size = nomes.size();
        for(int i = 0; i < size; i++){
            System.out.println(nomes.get(i));
        }

        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);


    }
}
