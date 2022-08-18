package day05_matematikselIşlemler;

import java.util.Scanner;

public class C03_RakamlarToplami {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 4 Basamaklı Pozitif Bir tam sayı giriniz");
        int sayi= scan.nextInt();


        int birlerBasamagi=0;
        int rakamlarToplami=0;
        int ilkGirilenSayi=sayi;

        birlerBasamagi=sayi%10;
        rakamlarToplami+=birlerBasamagi;
        sayi/=10;

        birlerBasamagi=sayi%10;
        rakamlarToplami+=birlerBasamagi;
        sayi/=10;

        birlerBasamagi=sayi%10;
        rakamlarToplami+=birlerBasamagi;
        sayi/=10;

        birlerBasamagi=sayi%10;
        rakamlarToplami+=birlerBasamagi;
        sayi/=10;

        System.out.println(ilkGirilenSayi+ "  sayısının rakamlar Toplamı  : "+rakamlarToplami);






    }
}
