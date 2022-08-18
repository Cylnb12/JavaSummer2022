package day22_multiDimensionalArray;

import java.util.Arrays;

public class C02_MdaTumElementleriYazdirma {
    public static void main(String[] args) {


        //verilen bir muti dimensional array in tum elementlerini yazdiran bir method olusturun

        int[][] sayilar={{1,5,6,9},{2,5},{3,1,6}};
        elementleriYazdir(sayilar);



    }

    public static void elementleriYazdir(int[][] sayilar) {
        for (int i = 0; i < sayilar.length; i++) {// i= 0,1,2 degerleri olacak
            for (int j = 0; j < sayilar[i].length; j++) {
                System.out.print(sayilar[i][j]+" ");
            }
        }

    }
}
