package br.com.gt.javacore.Rdates.test;

import java.util.Date;

public class DateTest01 {

    public static void main(String[] args) {

        Date date = new Date(1_000_000_000);
        System.out.println(date);
        System.out.println(date.getTime());

        //add 1 hora
        date.setTime(date.getTime() + 3_600_000);
        System.out.println(date);
    }
}
