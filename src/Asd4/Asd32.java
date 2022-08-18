package Asd4;

public class Asd32 {
    public static void main(String[] args) {



        /*
        1'den 100'e kadar olan doğal sayıların toplamını bulan programı yazınız.

OutPut:

Sayilarin Toplami : 5050
         */

        int sayi=1;
        int sayilarToplam=0;
        do {
            sayilarToplam+=sayi;
            sayi++;
        }while (sayi<=100);
        System.out.println("Sayilarin Toplami : " + sayilarToplam);
        
    }
}
