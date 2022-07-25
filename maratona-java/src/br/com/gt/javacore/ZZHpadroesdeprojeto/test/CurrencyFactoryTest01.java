package br.com.gt.javacore.ZZHpadroesdeprojeto.test;

import br.com.gt.javacore.ZZHpadroesdeprojeto.dominio.Country;
import br.com.gt.javacore.ZZHpadroesdeprojeto.dominio.Currency;
import br.com.gt.javacore.ZZHpadroesdeprojeto.dominio.CurrencyFactory;

public class CurrencyFactoryTest01 {
    public static void main(String[] args) {
        Currency currency = CurrencyFactory.newCurrency(Country.BRAZIL);
        System.out.println(currency.getSymbol());
    }
}
