package asd;

import java.util.Scanner;

public class Asd4 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int yil= scan.nextInt();

        if (yil%100==0){
            if (yil%400==0){
                System.out.println("Artik yil");
            }else {
                System.out.println("Artik yil Degildir");
            }

        }else {
            if (yil%4==0){
                System.out.println("Artik yil");
            }else {
                System.out.println("Artik yil Degildir");
            }
        }
    }
}
