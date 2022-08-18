package day23_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C03_indexOf {
    public static void main(String[] args) {

        List<String> urunler=new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cerkirdek");
        urunler.add("Cay");

        System.out.println(urunler);
        System.out.println(urunler.indexOf("Ikram"));//1
        System.out.println(urunler);

        /*
        indexOf() methodu bize bilgi donduren bir methoddur
        listemizi degistirmez

         */

        System.out.println(urunler.lastIndexOf("Ikram"));

        /*
        indexOf methodu aramaya 0. index ten
        lasIndexOf methodu ise aramaya son indexten baslar

        Arama bitip urun bulundugunda ikisi de bulunan urunun  indexini  verir
        o da bastan itibaren olan indextir
         */

        urunler.add("Ikram");

        System.out.println(urunler);//[Nutella, Ikram, Cerkirdek, Cay, Ikram]
        System.out.println(urunler.indexOf("Ikram"));//1
        System.out.println(urunler.lastIndexOf("Ikram"));//4

        System.out.println(urunler.indexOf("Hobby"));//-1
        System.out.println(urunler.lastIndexOf("Hobby"));//-1


    }
}
