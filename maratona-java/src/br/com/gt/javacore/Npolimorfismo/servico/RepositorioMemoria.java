package br.com.gt.javacore.Npolimorfismo.servico;

import br.com.gt.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em memória");
    }
}
