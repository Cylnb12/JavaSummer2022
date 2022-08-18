package day20_Arrays;

import java.util.Arrays;

public class C03_lenght {
    public static void main(String[] args) {


        //iki sakilde Array olusturulur
        int sayilar[] = {1, 2, 3};
        String harfler[] = new String[4];

        System.out.println("sayilar Array inin uzunlugunu : " + sayilar.length);//3

        System.out.println("harfler Array inin uzunlugu : " + harfler.length);//4

        System.out.println(Arrays.toString(harfler));//[null,null,null,null]

        //harfler array inin son elementini yazdiralim

        System.out.println(harfler[harfler.length-1]);
        //System.out.println(harfler[5]); fazla index yazildiginda
        // yazarken sikinti cikarmaz Run Time Error   ArrayIndexOfBoundsException veriri

    }
}
