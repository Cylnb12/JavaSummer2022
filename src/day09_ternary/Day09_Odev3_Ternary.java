package day09_ternary;

import java.util.Scanner;

public class Day09_Odev3_Ternary {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Sayi girinn");
        int input1=scan.nextInt();

        System.out.println((input1 >= 0)? input1:(-1*input1));
    }
}
