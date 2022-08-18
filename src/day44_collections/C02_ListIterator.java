package day44_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class C02_ListIterator {
    //Soru 4) Bir listedeki elementleri iterator kullanarak sondan basa dogru yazdirin

    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(Arrays.asList(2,13,56,23,45,14,40));
        System.out.println(list);
        ListIterator li1= list.listIterator();

        while (li1.hasNext()){
            li1.next();
        }
        while (li1.hasPrevious()){
            System.out.print(li1.previous()+" ");
        }
    }
}
