package day03_scanner;

import java.util.Scanner;

public class Day03_Odev06_IsimSoyisimYanyana {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen İsminizi Giriniz : ");
        String isim= scan.nextLine();
        System.out.println("Lütfen Soyisminizi Giriniz : ");
        String soyisim=scan.nextLine();
        System.out.println("İsim-soyisim : "+isim+"  "+soyisim);
    }
}
