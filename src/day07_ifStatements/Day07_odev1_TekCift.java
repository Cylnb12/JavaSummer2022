package day07_ifStatements;

import java.util.Scanner;

public class Day07_odev1_TekCift {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen Bir Sayi Giriniz :");
        int sayi = scan.nextInt();



        if (sayi % 2 == 0) {
            System.out.println("Sayiniz cift");
        } else{
            System.out.println("Sayiniz tek");}

    }
}
