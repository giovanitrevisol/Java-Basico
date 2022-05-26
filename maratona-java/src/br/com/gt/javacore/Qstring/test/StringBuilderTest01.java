package br.com.gt.javacore.Qstring.test;

public class StringBuilderTest01 {

    public static void main(String[] args) {
        String nome = "Giovani Trevisol";
        nome.concat(" Programador Java");

        // lembrando: neste caso estamos criando uma nova string na memoria.
        //nome = nome.concat(" Programador Java"); //assim estaremos printando a string - precisa ser atribuida a uma variável;

        System.out.println(nome);

        //--------------------------------

        StringBuilder sb = new StringBuilder("Giovani Trevisol");
        sb.append(" Programador").append(" estudando");
        //escreve de tras para frente
        sb.reverse();
        sb.reverse();
        //delete os caracteres nas posicoes
        sb.delete(0, 3);
        System.out.println(sb);
    }

    //os comando de stringBuilder funcionam para StringBuffer
}
