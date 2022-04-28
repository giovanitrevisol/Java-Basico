package br.com.gt.javacore.Qstring.test;

public class StringTest02 {

    public static void main(String[] args) {
        String nome = "Giovani ";
        String numeros = "012345";
        System.out.println(nome.charAt(0));
        System.out.println(nome.replace("i", "I"));
        System.out.println(nome.toUpperCase());
        System.out.println(nome.toLowerCase());

        System.out.println(numeros.length());
        System.out.println(numeros.substring(0,2)); //lembre-se que o final (2) é exclusivo, ou seja valor -1
        System.out.println(numeros.substring(3, numeros.length()));
        System.out.println(nome.trim()); //remove valores em branco

    }

}
