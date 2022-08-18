package day09_ternary;

import java.util.Scanner;
// Buyuk - kucuk harf mi degil mi?
public class Day09_Odev6_NestedTernary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("harf giriniz");
        char input1 = scan.next().charAt(0);

        System.out.println(input1 >= 'a' && input1 <= 'z' ? "Kucuk Harf" :
                input1 >= 'A' && input1 <= 'Z' ? "Buyuk Harf" :
                        "Girdiginiz karakter harf degil");
    }
}
