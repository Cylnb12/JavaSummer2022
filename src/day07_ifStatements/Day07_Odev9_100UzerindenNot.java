package day07_ifStatements;

import java.util.Scanner;

public class Day07_Odev9_100UzerindenNot {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir Puan Giriniz : ");

        int puan= scan.nextInt();

        if (puan>100||puan<=0){
            System.out.println("Lutfen 100 den kucuk bir sayi giriniz");
        }
        else if  (puan<=50){
            System.out.println("D");
        } else if (puan<60) {
            System.out.println("C");
        } else if (puan<80) {
            System.out.println("B");

        } else {
            System.out.println("A");

        }

    }
    }
