package day07_ifStatements;

import java.util.Scanner;

public class Day07_Odev_10_MaasTeklifi {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Vermeyi dusundugunuz maasi yaziniz");
        int maas= scan.nextInt();

        if (maas>80000){
            System.out.println("Kabul Edioyrum");

        } else if (maas<80000&maas>60000) {
            System.out.println("Konusabiiriz");

        } else if (maas<60000) {
            System.out.println("Maalesef kabul edemem");

        }


    }
}
