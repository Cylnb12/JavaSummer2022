package asd3;

import java.util.Scanner;

public class Asd20_CiftMI_PozitifMI {
    public static void main(String[] args) {
        /*kullanıcıdan bır sayı alın bu sayının tek mı cıft mı oldugunu
sıfırdan buyuk mu kucuk mu oldugunu ve ayrıca
100'den buykse birler,onlar ve yuzler basamagindaki rakamların toplamını
 100'den kucukse birler basamagını yazdıran 3 method olusturun
*/


        tekMiCiftMi();
        sifirdanBuyukMuKucukMu();
        yuzdenBuyukMuKucukMu();


    }

    public static void yuzdenBuyukMuKucukMu() {
        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi= scan.nextInt();
        if (sayi>100&&sayi<1000){
            int bBas=sayi%10;
            int oBas=(sayi/10)%10;
            int yBas=sayi/100;
            int rToplam=bBas+oBas+yBas;
            System.out.println("Girilen sayi 100e esit veya 100den buyuk ve girilen sayilarin toplami = "+rToplam);
        }else if (sayi<100){
            System.out.println("girilen sayi 100 den kucuk  "+(sayi%10));

        }else {
            System.out.println("girilen sayi 3 basamakli olmali");
        }


    }

    public static void sifirdanBuyukMuKucukMu() {
        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi= scan.nextInt();
        if (sayi>0){
            System.out.println("Sayi Pozitif");
        } else if (sayi<0) {
            System.out.println("Sayi Negatif");

        }else {
            System.out.println("sayi sifir");
        }
    }

    public static void tekMiCiftMi() {
        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi= scan.nextInt();
        if (sayi%2==0){
            System.out.println("sayi cift");

        }else {
            System.out.println("sayi tek");
        }
    }
}
