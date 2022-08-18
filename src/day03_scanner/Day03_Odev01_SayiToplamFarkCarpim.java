package day03_scanner;

import java.util.Scanner;

public class Day03_Odev01_SayiToplamFarkCarpim {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 1. Sayıyı Giriniz: ");
        int num1 = scan.nextInt();
        System.out.println("Lütfen 2. Sayıyı Gİriniz: ");
        int num2 = scan.nextInt();
        System.out.println("Sayılarınızın Toplamı=  " + (num1 + num2));
        System.out.println("Sayılarınızın Farkı  =  " + (num1 - num2));
        System.out.println("Sayılarınızın Çarpımı=  " + (num1 * num2));

    }
}
