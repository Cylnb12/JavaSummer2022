package day09_ternary;

import java.util.Scanner;
// Kare mi degil mi?
public class Day09_Odev7_NestedTernary {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Ardarda dikdortgen icin uzunluk ve genislik girin ve arada enter a basin");
        int input1=scan.nextInt();
        int input2=scan.nextInt();

        System.out.println((input1 == input2)? "Karedir":"Kare degildir");
    }
}
