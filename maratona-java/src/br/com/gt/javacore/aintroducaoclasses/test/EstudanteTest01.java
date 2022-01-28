package br.com.gt.javacore.aintroducaoclasses.test;

import br.com.gt.javacore.aintroducaoclasses.dominio.Estudante;

public class EstudanteTest01 {

    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Giovani";
        estudante.idade = 28;
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
