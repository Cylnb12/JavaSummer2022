package asd;

import java.util.Scanner;

public class Asd3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen sorgulamak istediginiz yili giriniz : ");
        int yil = scan.nextInt();

        if (yil%4 != 0) {
            System.out.println("Artik yil degil");

        } else if (yil%100 !=0 ) {
            System.out.println("Artik yil");

        } else if (yil%400 == 0) {
            System.out.println("Artik yil");
            
        }else {
            System.out.println("Artik yil degil ");
    }


    }
}
/*
if (yil%4!=0){
            System.out.println("Artik yil degil");
        } else if (yil%100!=0) {
            System.out.println("Artik yil");
        } else if (yil%400!=0) {
            System.out.println("Artik yil degil");

        }else {
            System.out.println("Artik yil");
        }

 */