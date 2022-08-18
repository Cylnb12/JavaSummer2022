package day24_arrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C05_Soru5SayidanKucukFibonacci {
    public static void main(String[] args) {
//verilen bir sayida kucuk tum fibonacci sayilarini bir liste olarak olusturup yazdriniz
        Scanner scan=new Scanner(System.in);
        int birinciSayi=0;
        int ikinciSayi=1;
        int ucuncuSayi=birinciSayi+ikinciSayi;

        int maxSayi= scan.nextInt();
        List<Integer> liste=new ArrayList<>();

        liste.add(birinciSayi);
        liste.add(ikinciSayi);
        for (int i = 0; i < maxSayi; i++) {

            if (ucuncuSayi<=maxSayi){
                liste.add(ucuncuSayi);

                birinciSayi=ikinciSayi;
                ikinciSayi=ucuncuSayi;
                ucuncuSayi=birinciSayi+ikinciSayi;

            }else break;


        }
        System.out.println(liste);

    }
}
