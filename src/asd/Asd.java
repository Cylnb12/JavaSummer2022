package asd;

import java.util.Scanner;

/* emeklilik kontrolu yapan bir program yaziniz
cinsiyet olarak E (ERKEK) veya K (KADIN) degiskenlerini kabul etsin
farkli bir harf veya sembol girilirse hata mesajı versin
​
emeklilik icin kadinlarda yas siniri 60
erkeklerde 65 olsun
negatif yas veya 80'den buyuk yas girilirse hata mesaji versin
 */

public class Asd {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen cinsiyet giriniz erkek icin 'E' kadin icin 'K' ");
        char cinsiyet=scan.next().toUpperCase().charAt(0);
        System.out.println("Lutfen sorgulamak istediginiz yasi giriniz");
        int yas=scan.nextInt();

        if (yas<0||yas>80){
            System.out.println("Lutfen 0-80 yas araliginda bir yas yaziniz");
        }
        if (cinsiyet=='E'){
            if (yas>=65){
                System.out.println("Emekli olabilirsin");
            }else {
                System.out.println("Emekli olamazsin");
            }


        } else if (cinsiyet=='K') {
            if (yas>=60){
                System.out.println("Emekli olabilirsin");
            }else {
                System.out.println("Emekli olamazsin");
            }


        }else {
            System.out.println("lutfen gecerli bir cinsiyet giriniz");
        }


    }
    }

