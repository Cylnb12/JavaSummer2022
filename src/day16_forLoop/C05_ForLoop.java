package day16_forLoop;

import java.util.Scanner;

public class C05_ForLoop {
    public static void main(String[] args) {
        //Soru 10 ) Kullanicidan iki sayi isteyin.
        // Girilen sayilar ve aralarindaki tum tamsayilari toplayip,
        // sonucu yazdiran bir program yaziniz
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen baslagic ve bitis degerlerini pozitif tam sayi olarak girin");

        int bas= scan.nextInt();
        System.out.println();
        int bit= scan.nextInt();
        aralariTopla(bas,bit);
    }

    public static void aralariTopla(int bas, int bit) {
        int toplam=0;
        if (bas<=bit){
            for (int i = bas; i <=bit ; i++) {
                toplam=toplam+i;

            }
        }else {
            for (int i = bit; i <=bas ; i++) {
                toplam=toplam+i;

            }
        }
        System.out.println(toplam);
    }
}
