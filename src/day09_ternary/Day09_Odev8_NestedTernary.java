package day09_ternary;

import java.util.Scanner;
// Uc Basamakli Veya Degil
public class Day09_Odev8_NestedTernary {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Sayi girin");
        int input1=scan.nextInt();

        System.out.println((input1 >=100 && input1<1000)? "Uc Basamakli Sayi":
                "Uc basamakli Sayi Degil");
    }
}
