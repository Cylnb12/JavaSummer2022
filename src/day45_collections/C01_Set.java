package day45_collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C01_Set {
    public static void main(String[] args) {

        // verilen bir array deki tekrar eden elementleri silip
        //tekrarsiz halini array a atayan bir kod yaziniz

        int[] arr={4,5,3,6,8,5,1,9,0,4,2,5,7,9,1,2,5,7,6};

        Set<Integer> tekrarsizSet=new HashSet<>();
        for (int w:arr
             ) {
            tekrarsizSet.add(w);
        }
        int i=0;
        System.out.println(tekrarsizSet);//[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
        int [] tekrarsizArr=new int[tekrarsizSet.size()];
        for (int w:tekrarsizSet
             ) {
            tekrarsizArr[i]=w;
            i++;
        }
        arr=tekrarsizArr;
        System.out.println("Bizim oglanin son hali  : "+Arrays.toString(tekrarsizArr));//Bizim oglanin son hali  : [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]


    }
}
