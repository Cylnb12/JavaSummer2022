package asd2;

import java.util.Scanner;

public class Asd12 {
    public static void main(String[] args) {
//Kullanıcıdan dakika girmesini isteyin, Dakikaları birkaç yıl ve
// gün sayısına dönüştürmek için bir Java programı yazın.
//
//INPUT:
//
//Dakika sayısı: 3456789
//
//OUTPUT :
//
//3456789 dakika yaklaşık 6 yıl 210 gündür
        Scanner scan=new Scanner(System.in);

        double dakika= scan.nextInt();

        double saat=dakika/60;

        int gun= (int) (saat/24);

        int yil= (int) (gun/365);


        System.out.println("3456789 dakika yaklasik "+yil+" yil "+ gun%365+" gundur");


    }
}
