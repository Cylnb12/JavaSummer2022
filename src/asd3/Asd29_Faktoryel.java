package asd3;

import java.util.Scanner;

public class Asd29_Faktoryel {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Hade 10 dan kucuk bi sayi gir bakem de faktoryel hesaplayam");
        int sayi=scan.nextInt();
        fakto(sayi);


    }

    public static void fakto(int sayi) {
        int result=1;
        for (int i = sayi; i >1 ; i--) {
            result=result*i;


        }
        System.out.println("Girilen Sayinin Faktoryeli = "+result);
    }
}
