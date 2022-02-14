package br.com.gt.javacore.Gassociacao.test;

import br.com.gt.javacore.Gassociacao.dominio.Aluno;
import br.com.gt.javacore.Gassociacao.dominio.Local;
import br.com.gt.javacore.Gassociacao.dominio.Professor;
import br.com.gt.javacore.Gassociacao.dominio.Seminario;

public class AssociacaoTeste {
    public static void main(String[] args) {
        Local local = new Local("Rua das laranjeiras");
        Aluno aluno = new Aluno("Luffy", 17);
        Professor professor = new Professor("Barba Branca", "Pirata");
        Aluno[] alunosParaSeminario = {};

        Seminario seminario = new Seminario("Onde achar one piece", alunosParaSeminario, local);

        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();
    }
}
