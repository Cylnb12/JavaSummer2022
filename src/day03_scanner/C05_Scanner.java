package day03_scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("İlk sayıyı giriniz:");
        double sayi1=scan.nextDouble();
        System.out.println("2. sayıyı giriniz:");
        double sayi2=scan.nextDouble();
        System.out.println("Yazdıgınız Sayıların Çarpımı"+sayi1*sayi2);

    }
}
