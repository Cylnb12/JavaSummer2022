package day07_ifStatements;

import java.util.Scanner;

public class C06_IfElseSteatments {
    public static void main(String[] args) {


        /*
        Soru 3) Kullaniciya yasini sorun, eger yas 65’den kucuk
         ise “emekli olamazsin, calismalisin”, 65’e esit veya
         buyukse “Emekli olabilirsin” yazdirin

         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen Yasinizi Giriniz : ");
        int yas=scan.nextInt();

        if (yas<65){
            System.out.println("Emekli olamazsin  "+(65-yas)+" yil daha Calismalisin");

        }else {
            System.out.println("Emekli olabilirsin");
        }

    }
}
