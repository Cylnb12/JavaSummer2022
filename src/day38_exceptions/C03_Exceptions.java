package day38_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_Exceptions {
    public static void main(String[] args) {
        /*
        Marketteki tum urunleri bir array de tuttugumuzu varsayalim
        kullaniciya index sorup o indexteki urunu yazdiran
        bir program yazalim

        kullanici urun sayisindan buyuk bir index girerse exception
         vermesinin onune gecelim


         */


        String urunler[]={"nutella","cokokrem","sut","Cay","Findik"};
        Scanner scan=new Scanner(System.in);
        System.out.println("istediginiz urunun sira no giriniz");

        int istenenSira=scan.nextInt();
        try {
             istenenSira=scan.nextInt();
        } catch (InputMismatchException deneme) {
            System.out.println("urun indexi icin bir tamsayi gimeniz gerekli");
            System.out.println("deneme = " + deneme);
        }

        /*
        catch blogunun onundeki parantezde
        exception class inin ismi ve yaninda
        yakalanan exception u atadigimiz variable in ismi olur

        Eger yakalanan exception ile ilgili bilgileri
        kullaniciya vermek isterseniz
        bu objeyi kullanabilirsiniz
         */

        try {
            System.out.println("Aradiginiz urun : "+urunler[istenenSira-1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("urun listesini asamazsiniz");
            System.out.println("Sira numarasi en fazla : "+urunler.length+" olabilir");
        }

    }
}
