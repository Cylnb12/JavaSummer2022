package day02_variables;

import java.util.Scanner;

public class C02_Variable {
    public static void main(String[] args) {



        int sayi = 10;
        boolean guzelMi=true;
        char sayim='3';

        System.out.println(sayi);
        System.out.println("sayi");
        System.out.println("sayi  :" + sayi);

        String isminiz= "Mehmet";
        String soyisminiz = "Bulutöz";

        System.out.println("isminiz     :"+isminiz);
        System.out.println("soyisminiz  :"+soyisminiz);




        short a= 7555;
        byte  b= 127;
        int   c= a+b;
        System.out.println("a    = " +a);
        System.out.println("b    = " +b);
        System.out.println("a+b  = "+c);




        float  x= 150.534f;
        long   y= 475384;
        double z= x+y;

        System.out.println("x=      " + x);
        System.out.println("y=      " + y);
        System.out.println("toplam :" + z);



        char w = '^';



        char p= '3';
        int  r= 44;
        int s= p+r;

        System.out.println("p = " +p);
        System.out.println("r = " +r);
        System.out.println("p+r toplam = " + s);
        System.out.println("Bu Şekilde İşlem Yapsa Da İşlem Doğtu DEĞİL!!!");






    }


}
