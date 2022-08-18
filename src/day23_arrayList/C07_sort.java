package day23_arrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class C07_sort {
    public static void main(String[] args) {
        List<String> urunler=new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cerkirdek");
        urunler.add("Cay");

        Collections.sort(urunler);//[Cay, Cerkirdek, Ikram, Nutella]
        System.out.println(urunler);
        /*
        List ile gelen sort methodu'nda siralama ozelligini girmek gerekiyor
        bunun yerine Collections classindan sort methodunu kullaniyourz

        bu method listemizi natural order'a gore siralar

         */

    }
}
