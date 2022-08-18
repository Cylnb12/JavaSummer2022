package day07_ifStatements;

import java.util.Scanner;

public class Day07_Odev8PozitiftoplamNegatifCarpim {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("Lutfen islem icin iki sayi giriniz\n sayi1: ");
        int sayi1= scan.nextInt();
        System.out.println("Sayi2: ");
        int sayi2= scan.nextInt();

        if (sayi1>0&&sayi2>0){
            System.out.println("Pozitif Sayilar Toplami: "+(sayi1+sayi2));

        } else if (sayi1<0&&sayi2<0) {
            System.out.println("Negatif Sayilar Carpimi : "+(sayi1*sayi2));

        } else if ((sayi1<0&&sayi2>0)||(sayi1>0&&sayi2<0)) {
            System.out.println("Farkli isaretli sayilarla islem yapamazsiniz");
            
        } else if (sayi1==0||sayi2==0) {
            System.out.println("sifir carpmaya gore yutan elemandir");
            
        }
    }
    }

