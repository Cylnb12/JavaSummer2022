package day21_Arrays;

import java.util.Arrays;

public class C08_binarySearch {
    public static void main(String[] args) {

        /*
        Binary search  javada eleman aramanin kisa yoludur.
        ancak binarysearch in calismasi icin once
         array in once sirali hale getirilmesi gerekir.
        Eger siralama yapmadan binary search yaparsaniz
        sonucu bulamayabilir yada yanlis bulabilir
         */
        String[] harfler={"Y","B","D","G","O","A"};

        String arananHarf="Y";


        Arrays.binarySearch(harfler,arananHarf);
        System.out.println(Arrays.binarySearch(harfler,arananHarf));
        System.out.println((C03_contains.contains(harfler,arananHarf)));

        //binarySearch bize aradigimiz elemanin index ini dondurur
        //Array sirali olmadigi icin arama sonucunu dogru bulamayabilir
        //emin olmak icin once sort yapmaliyiz
        Arrays.sort(harfler);
        System.out.println(Arrays.toString(harfler));
        System.out.println(Arrays.binarySearch(harfler,arananHarf));

    }
}
