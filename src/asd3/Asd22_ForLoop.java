package asd3;

import java.util.Scanner;

public class Asd22_ForLoop {
    public static void main(String[] args) {


        for (int i = 0; i < 10; i++) {
            System.out.println("Java guzeldir");

        }

        for (int i = 10; i <= 30; i++) {
            System.out.print(i + ",");

        }
        System.out.println();
        for (int i = 100; i >= 50; i--) {
            System.out.print(i + ",");

        }
        System.out.println();
        Scanner scan = new Scanner(System.in);
        System.out.println("100 den kucuk bir sayi giriniz");
        int sayi = scan.nextInt();
        for (int i = 1; i <= sayi; i++) {
            if (sayi < 100 && i % 3 == 0) System.out.print(i + ",");

        }
        System.out.println();
        Scanner scn = new Scanner(System.in);
        System.out.println("100 den kucuk bir sayi giriniz");
        int sayi1 = scn.nextInt();
        for (int i = 1; i <= sayi; i++) {
            if (sayi < 100 && (i % 3 == 0 || i % 5 == 0)) {
                System.out.print(i + ",");
            }

            System.out.println();
        }
        System.out.println("Lutfen 100 den kucuk bir sayi giriniz");
        int sayi2=scan.nextInt();
        if (sayi2< 100){
            for (int i = 1; i <=sayi2 ; i++) {
                if (i%3==0&&i%5==0) {
                    System.out.print("Java guzeldir,");
                } else if (i%3==0) {
                    System.out.print("Java,");

                } else if (i%5==0) {
                    System.out.print("Guzeldir,");

                }else {
                    System.out.print(i+",");
                }

            }
        }
    }
}
