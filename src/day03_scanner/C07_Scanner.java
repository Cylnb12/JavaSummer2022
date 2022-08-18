package day03_scanner;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("Lütfen İsminizi, Soyisminizi, Yaşınızı Gİriniz ve \nAralarda Enter Tuşuna Basınız");

        String isim=scan.nextLine();
        System.out.println();


        String soyisim= scan.nextLine();
        System.out.println();


        int yas= scan.nextInt();

        System.out.println("Kullanıcı adı ,soyadı ve yaşı:   "+isim+"  "+soyisim+"  "+yas);
    }
}
