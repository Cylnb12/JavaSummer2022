package day09_ternary;

import java.util.Scanner;
//tek mi cift mi
public class day09_Odev2_Ternary {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("sayi girin ");
        int input1=scan.nextInt();

        System.out.println((input1%2==0)?"Cift":"Tek");
    }
}
