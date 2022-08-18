package day03_scanner;

import java.util.Scanner;

public class Day03_Odev07_IsimAlipBasHarfGosterme {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen İsminizi Yazınız : ");
        char isim=scan.next().toUpperCase().charAt(0);
        System.out.println("İsminizin Baş Harfi    "+isim);

    }
}
