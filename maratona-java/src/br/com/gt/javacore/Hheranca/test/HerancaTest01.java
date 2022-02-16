package br.com.gt.javacore.Hheranca.test;

import br.com.gt.javacore.Hheranca.dominio.Endereco;
import br.com.gt.javacore.Hheranca.dominio.Funcionario;
import br.com.gt.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("012345-209");
        Pessoa pessoa = new Pessoa("Toyohisa Shimazu");
        pessoa.setCpf("1111111");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Oda Nobunaga");
        funcionario.setCpf("22222");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);
        System.out.println("----------------");
        funcionario.imprime();
    }
}
