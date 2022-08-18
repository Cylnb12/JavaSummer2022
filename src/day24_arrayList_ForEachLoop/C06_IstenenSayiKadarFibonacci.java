package day24_arrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C06_IstenenSayiKadarFibonacci {
    public static void main(String[] args) {

//birden baslayarak istenen kadar fibonacci sayisini bir liste olarak olusturup yazdirin
        Scanner scan=new Scanner(System.in);
        int birinciSayi=0;
        int ikinciSayi=1;
        int ucuncuSayi=birinciSayi+ikinciSayi;

        int istenenSayi= scan.nextInt();
        List<Integer> liste=new ArrayList<>();

        liste.add(birinciSayi);
        liste.add(ikinciSayi);
        for (int i = 2; i < istenenSayi; i++) {

            liste.add(ucuncuSayi);

            birinciSayi=ikinciSayi;
            ikinciSayi=ucuncuSayi;
            ucuncuSayi=birinciSayi+ikinciSayi;



        }
        System.out.println(liste);

    }
}
