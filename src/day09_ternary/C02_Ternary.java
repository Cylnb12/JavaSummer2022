package day09_ternary;

import java.util.Scanner;

public class C02_Ternary {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        double sayi= scan.nextDouble();
        // eger  ternary icindeki sonuclar farkli data turlerinde ise atama yapamayiz sadece yazdirabiliriz
       // String sonuc sayi>0 ? "Sayi pzitif": (sayi*sayi);
        // eger itenirse 0 icin sayi notr olabilir

        System.out.println(sayi>0 ? "Sayi pozitif":
                         (sayi==0) ? "sayi notr" : (sayi*sayi));
    }
}
