package br.com.gt.javacore.Zgenerics.test;

import br.com.gt.javacore.Zgenerics.dominio.Barco;
import br.com.gt.javacore.Zgenerics.dominio.Carro;
import br.com.gt.javacore.Zgenerics.service.BarcoRentavelService;
import br.com.gt.javacore.Zgenerics.service.CarroRentavelService;

public class ClasseGenericaTest02 {
    public static void main(String[] args) {
        BarcoRentavelService barcoRentavelService = new BarcoRentavelService();
        Barco barco = barcoRentavelService.buscarBarcoDisponivel();
        System.out.println("Usando o barco por um mês...");
        barcoRentavelService.retornarBarcoAlugado(barco);
    }
}
