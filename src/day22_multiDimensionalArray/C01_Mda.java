package day22_multiDimensionalArray;

import java.util.Arrays;

public class C01_Mda {
    public static void main(String[] args) {

        /*
        tek katli array lerde array i direk yazdiramiyoruz
        cunku array non-primitive data turudur ve
        her non-primitive data direk yazdirilamayabilir
        Arrays.toString(....)

        ancak array in icersiindeki elementleri direk yazdirabiliyorduk
        cunku genelde primitive data turu ve string elementler kullaniliyordu

        Multi-Dimensional Array lerde en dikkat edecegimiz konu
        ulasmak istedigimiz elementin bir array mi yoksa
        primitive data mi oldugudur


         */

        int[][] sayilar={{1,2,4,5},{3,4}};

        /*
        burada sayilar array ini dusunirsek icinde 2 tane inner array var.
        sayilar[0] ==>[1,2,4,5]
        ancak en icerdeki elementlere ulasirsak direk yazdirabiliriz

         */
        System.out.println(sayilar[0]);//referans verir //[I@19dfb72a
        System.out.println(Arrays.toString(sayilar[0]));//[1, 2, 4, 5]

        System.out.println(sayilar[0][1]);//2
        System.out.println(sayilar[1][0]);//3


        System.out.println(Arrays.toString(sayilar));// referans //[[I@19dfb72a, [I@17c68925]
        System.out.println(Arrays.deepToString(sayilar));//[[1, 2, 4, 5], [3, 4]]

        /*
        array i iki sekilde deklare edebiliyorduk
        1- elemanlari direk yazabiliriz
        int[][] sayilar={{1,2,4,5},{3,4}};
        2- outer ve inner arraylerin uzunluklarini belirterek yapabiliriz
        int[][] sayilar=new int[3][4];

        ancak 2. seklide inner arraylerin farkli uzunlukta olma ihtimali kalmaz
        bu ornek icin  outer array in 3 tane inner array i vardir
        her bir inner array in ise 4 er elemani vardir

        eger inner array i farkli uzunluklarda olusturmak istiyorsaniz
        mecburen ilk yontemi kullanmalisiniz
         */

    }
}
