package day08_ifStatements;

import java.util.Scanner;

public class C03_NestedIfElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
/* emeklilik kontrolu yapan bir program yaziniz
cinsiyet olarak E (ERKEK) veya K (KADIN) degiskenlerini kabul etsin
farkli bir harf veya sembol girilirse hata mesajı versin

emeklilik icin kadinlarda yas siniri 60
erkeklerde 65 olsun
negatif yas veya 80'den buyuk yas girilirse hata mesaji versin
 */

        System.out.println("Lutfen cinsiyetinizi giriniz" + "\n kadin icin K erkek icin E");
        char cinsiyet = scan.next().toUpperCase().charAt(0);
        System.out.println("Lutfen yasinizi giriniz ");
        double yas = scan.nextDouble();

        if (cinsiyet == 'E') {
            if (yas < 0 || yas > 80) {
                System.out.println("gecerli yas giriniz");
            } else if (yas < 65) {
                System.out.println("Emekli olamazsin");

            } else {
                System.out.println("Emekli olabilirsin");

            }
        } else if (cinsiyet == 'K') {
            if (yas < 0 || yas > 80) {
                System.out.println("gecerli yas giriniz");
            } else if (yas < 60) {
                System.out.println("Emekli olamazsin");

            } else {
                System.out.println("Emekli olabilirsin");

            }

        } else {
            System.out.println("Lutfen gecerli bir cinsiyet giriniz");
        }


    }
}
