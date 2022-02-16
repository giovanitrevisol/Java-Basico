package br.com.gt.javacore.Npolimorfismo.test;

import br.com.gt.javacore.Npolimorfismo.dominio.Computador;
import br.com.gt.javacore.Npolimorfismo.dominio.Televisao;
import br.com.gt.javacore.Npolimorfismo.dominio.Tomate;
import br.com.gt.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10i7", 11000);
        Tomate tomate = new Tomate("Tomate Siciliano", 10);
        Televisao tv = new Televisao("Samsung 50\" ", 5000);

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("-------------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("-------------------------");
        CalculadoraImposto.calcularImposto(tv);
    }
}
