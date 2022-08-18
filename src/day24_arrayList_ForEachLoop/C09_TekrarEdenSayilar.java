package day24_arrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C09_TekrarEdenSayilar {
    public static void main(String[] args) {
        // verilen bir array deki tekrar edenleri yazdirma

        int[] arr={2,3,5,6,3,4,1,9,6,3,5};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        List<Integer> tekrarEdenler=new ArrayList<>();

        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]==arr[i+1]&& !tekrarEdenler.contains(arr[i])){

                System.out.print(arr[i]+" ");
                tekrarEdenler.add(arr[i]);
            }
        }
    }
}
