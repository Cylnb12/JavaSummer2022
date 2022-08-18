package day45_collections;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class C03_Soru1 {
    // //Soru 1 : Bir TreeSet ve HashSet’e random 100 sayi ekleyin,
    // islem surelerini kiyaslayin
    public static void main(String[] args) {
        Random rnd=new Random();
        TreeSet<Integer> ts=new TreeSet<>();
        HashSet<Integer> hs=new HashSet<>();
int sayac=0;
        Long time=System.currentTimeMillis();
        System.out.println("1   "+time);
        while (sayac<=1000000){
            ts.add(rnd.nextInt(1000000));
            sayac++;
        }

        System.out.println();
        System.out.println("2   "+time);
        System.out.println();
sayac=0;
        while (sayac<=1000000){
            hs.add(rnd.nextInt(1000000));
            sayac++;
        }
        System.out.println("3   "+time   );
    }
}
