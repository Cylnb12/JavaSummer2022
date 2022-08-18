package day14_methodCreation;

import day13_methodCreation.C04_MethodCreation;

public class C02_MethodCreation {
    public static void main(String[] args) {
        //verilen uc basamakli bir sayinin rakamlari toplamini
        // yazdiran bir methid olusturalim
        int input=423;
        rakamlariTopla(input);
        C04_MethodCreation.topla(6,3);
        C01_MethodCreation.terstenYazdir("nuri");


    }

    public static void rakamlariTopla(int input) {
        int birlerbasamagi=0;
        int rakamlartoplami=0;
        int temp=input;

        birlerbasamagi=input%10;
        rakamlartoplami+=birlerbasamagi;
        input/=10;


        birlerbasamagi=input%10;
        rakamlartoplami+=birlerbasamagi;
        input/=10;

        birlerbasamagi=input%10;
        rakamlartoplami+=birlerbasamagi;
        input/=10;

        System.out.println("Girdiginiz  "+temp+" sayisinin rakamlar toplami : "+rakamlartoplami);


    }
}
