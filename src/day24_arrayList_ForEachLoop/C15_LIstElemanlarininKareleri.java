package day24_arrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C15_LIstElemanlarininKareleri {
    public static void main(String[] args) {

        int[] sayilar={3,4,1,5,7,6,5,4};
        Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar));
        List<Integer> miniList=new ArrayList<>();
        for (int i = 0; i < sayilar.length; i++) {
            miniList.add(sayilar[i] );
        }
        System.out.println(miniList);
        int sum=0;
        for (Integer each:miniList
             ) {
            sum+=each*each;

        }
        System.out.println("sum = " + sum);
    }
}
