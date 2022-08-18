package day24_arrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C10_UniqeArrayOlusturma {
    public static void main(String[] args) {

        //Soru 2) Verilen bir array’deki unique elementleri
        // yeni bir array olarak donduren bir method olusturun

        int[] arr={2,3,5,6,3,4,1,9,6,3,5};

        int[] uniqueArray=uniqueArrayOlustur(arr);
        System.out.println(Arrays.toString(uniqueArray));



    }

    public static int[] uniqueArrayOlustur(int[] arr) {

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        List<Integer> benzersizList = new ArrayList<>();
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                benzersizList.add(arr[i]);
            }
        }
        // son elementi kontrol edip , yoksa listeye yazdir
        if (!benzersizList.contains(arr[arr.length-1])){
            benzersizList.add(arr[arr.length-1]);
        }

        int[] tekrarsizArr=new int[benzersizList.size()];
        for (int i = 0; i < tekrarsizArr.length; i++) {
            tekrarsizArr[i]=benzersizList.get(i);
        }


        return tekrarsizArr;
    }
}
