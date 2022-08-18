package day03_scanner;

import java.util.Scanner;

public class Day03_Odev05_IsimSoyisimKayitAlindi {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen İsminizi Yazınız : ");
        String isim=scan.nextLine();
        System.out.println("Lütfen Soyisminizi Yazınız : ");
        String soyisim=scan.nextLine();
        System.out.println("İsminiz    : "+isim+"\n"+"Soyisminiz    : "+soyisim+"\n"+"Kursumuza Katılımınız Alınmıştır, Teşekkür Ederiz..." );
    }
}
