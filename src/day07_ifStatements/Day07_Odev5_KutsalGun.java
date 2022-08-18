package day07_ifStatements;

import java.util.Scanner;

public class Day07_Odev5_KutsalGun {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir gun giriniz");
         String haftaninGunu= scan.next().toUpperCase();

         if (haftaninGunu.equals("CUMA")){
             System.out.println("Muslumanlarin kutsal gunu ");

         }

        if (haftaninGunu.equals("CUMARTESI")||haftaninGunu.equals("CUMARTESİ")){
            System.out.println("Yahudilerin kutsal gunu");
        }

        if (haftaninGunu.equals("PAZAR")){
             System.out.println("Hristiyanlarin kutsal gunu");
         }

    }
}
