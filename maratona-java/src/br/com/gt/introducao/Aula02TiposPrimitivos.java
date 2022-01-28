package br.com.gt.introducao;

public class Aula02TiposPrimitivos {

    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int idade = 10;
        long numeroGrande = 100000;
        double salarioDouble = 2000;
        float salarioFloat = 2500;
        byte idadeByte = -128;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0041'; // valores unicode

        System.out.println("A idade é " + idade + " anos");
        System.out.println(falso);
        System.out.println("char "+caractere);

        // String não é um tipo primitivo
        String nome = "Giovani";
    }
}
