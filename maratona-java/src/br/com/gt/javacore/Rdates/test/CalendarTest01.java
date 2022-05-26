package br.com.gt.javacore.Rdates.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {

    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();
        Date date = c.getTime();
        System.out.println(c);
        System.out.println(date);

        if(c.getFirstDayOfWeek() == Calendar.SUNDAY){
            System.out.println("Domingo é o Primeiro dia da semana");
        }

        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_YEAR));
        System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));

        //add dias
        c.add(Calendar.DAY_OF_MONTH, 2);
        Date dateAdd = c.getTime();
        System.out.println(dateAdd);

        //add horas
        c.add(Calendar.HOUR, 2);
        Date dateAddHour = c.getTime();
        System.out.println(dateAddHour);
    }
}
