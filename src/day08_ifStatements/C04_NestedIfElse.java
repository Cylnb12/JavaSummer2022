package day08_ifStatements;

import java.util.Scanner;

public class C04_NestedIfElse {
    public static void main(String[] args) {
     // Soru12)Kullanıcıdan 4 basamakli bir sayi girmesini isteyin.
       //         Girdiği sayi 5’e   bölünüyorsa son rakamını kontrol edin.
        //Son rakamı 0 ise ekrana “5’e bölünen çift sayı” yazdırın.
          //      Son rakamı 0 değil ise “5’e bölünen tek sayı” yazdırın.
            //    Girdiği sayi 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdırın.*

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 4 basamakli bir tamsayi giriniz");
        int sayi= scan.nextInt();

        if (sayi<1000 ||sayi>10000) {
            System.out.println("lutfen 4 basamakli sayi giriniz");
        } else if (sayi%5==0) {
            if (sayi%10==0) {
                System.out.println("5 e  bolunen cift sayi");
            } else{
                System.out.println("5 e bolunen tek sayi");
            }




        }else {
            System.out.println("Lutfen Tekrar Deneyiniz");

        }

    }
}
