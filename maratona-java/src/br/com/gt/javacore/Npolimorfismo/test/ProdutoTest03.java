package br.com.gt.javacore.Npolimorfismo.test;

import br.com.gt.javacore.Npolimorfismo.dominio.Computador;
import br.com.gt.javacore.Npolimorfismo.dominio.Produto;
import br.com.gt.javacore.Npolimorfismo.dominio.Tomate;
import br.com.gt.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000);

        Tomate tomate = new Tomate("Americano", 20);
        tomate.setDataValidade("11/12/2021");

        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("-----------------");
        CalculadoraImposto.calcularImposto(produto);

    }
}
