package day09_ternary;

import java.util.Scanner;

public class Day09_Odev1_Ternary {
    public static void main(String[] args) {

//kucuk sayiyi yazdirma
        Scanner scan=new Scanner(System.in);
        System.out.println("Ardarda iki sayi girin ve arada enter a basin");
        int input1=scan.nextInt();
        int input2=scan.nextInt();

        System.out.println((input1<input2) ? input1:input2);
    }
}
