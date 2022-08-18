package day12_stringManupilation;

import java.util.Scanner;

public class Day12_Odev6_cozum2_DahaKolay {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir sifre giriniz");
        String sifre=scan.nextLine();


        boolean ilkHarf=sifre.charAt(0)>='A' && sifre.charAt(0)<='Z';
        boolean sonHarf=sifre.charAt(sifre.length()-1)>='a' && sifre.charAt(sifre.length()-1)<='z';
        boolean bosluk=!sifre.contains(" ");
        boolean uzunluk=sifre.length()>=8;


        if (ilkHarf && sonHarf && bosluk && uzunluk) {
            System.out.println("Sifre basari ile tanimlandi");
        } else {
            System.out.println("Islem basarisiz, Lutfen yeni bir sifre girin");
        }
    }
}
