package day45_collections;

import java.util.*;

public class C04_Soru2 {
    public static void main(String[] args) {
        //Soru 2 : Ilk soruya 3.bir islem ekleyelim,
        // set’i Hashset olarak olusturup elemanlari ekleyelim
        // ve sonra TreeSet’e cevirip yazdiralim
        // Long time=System.currentTimeMilis() method’unu kullanin

        Set<Integer> hs=new HashSet<>();

        Random rnd=new Random();

        Long time=System.currentTimeMillis();
        System.out.println(time);
        int sayac=0;
        while (sayac<=10000){
            hs.add(rnd.nextInt(100000));
            sayac++;
        }
        System.out.println(hs);
        System.out.println(time);
        Set<Integer> ts=new TreeSet<>(hs);

        System.out.println(ts);

        System.out.println(time);
    }
}
