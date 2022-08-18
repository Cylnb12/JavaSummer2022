package asd;

import java.util.Scanner;

public class Asd1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen sifrenizi giriniz");
        char sifre = scan.next().charAt(0);

        if (sifre >= 'A' & sifre <= 'Z') {
            if (sifre == 'A') {
                System.out.println("Sifreniz dogru");
            } else {
                System.out.println("Sifreniz yanlis");
            }
        } else if (sifre >= 'a' & sifre <= 'z') {
            if (sifre=='z'){
                System.out.println("Sifreniz dogru");
            }else {
                System.out.println("Sifreniz yanlis");
            }

        }else {
            System.out.println("lutfen sifrenizi harlerden olusacak sekilde giriniz");
        }
    }
}
