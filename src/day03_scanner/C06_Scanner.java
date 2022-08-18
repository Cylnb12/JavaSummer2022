package day03_scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("Lütfen İsminizi Giriniz:");
        String kullaniciIsmi=scan.nextLine();
        System.out.println("Lütfen Soyisminizi Giriniz:");
        String kullaniciSoyismi=scan.nextLine();
        System.out.println("Lütfen Yaşınızı Giriniz:");
        double kullaniciYasi=scan.nextDouble();
        System.out.println("Kullanıcı adı ,soyadı ve yaşı:   "+kullaniciIsmi+"  "+kullaniciSoyismi+"  "+kullaniciYasi);


    }
}
