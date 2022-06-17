package br.com.gt.javacore.zzzzztestgio;

public class teste {

    public static void main(String[] args) {

        String documentString = "02930541008";
        String documentStringNull = null;
        String documentStringVoid = "";


        Long document1 = Long.parseLong(documentString);
        System.out.println(document1);

        Long documentx = Long.valueOf(documentString);
        System.out.println(document1);

        Long document2 = Long.valueOf(documentStringNull);
        System.out.println(document2);

        Long document3 = Long.valueOf(documentStringVoid);
        System.out.println(document3);

    }

    public void convertStringToLong(String value){

    }
}
