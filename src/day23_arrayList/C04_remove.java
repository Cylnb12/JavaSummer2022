package day23_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C04_remove {
    public static void main(String[] args) {


        List<String> urunler=new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cerkirdek");
        urunler.add("Cay");



        /*
        remove methodu iki sekilde kullanilir
        1- objeyi yazip silmesini istersek bize booleen sonuc doner
        2- index girersek bu defa o indexteki elemani siler
        ve bize silinen elemani dondurur.
         */
        System.out.println(urunler);//[Nutella, Ikram, Cerkirdek, Cay]
        System.out.println(urunler.remove("Ikram"));//true
        System.out.println(urunler);//[Nutella, Cerkirdek, Cay]

        System.out.println(urunler.remove("Hobby"));//false
        System.out.println(urunler);//[Nutella, Cerkirdek, Cay]


        // ikinci yontemi deneyip index girelim

        System.out.println(urunler.remove(1));//cekirdek
        System.out.println(urunler);//[Nutella, Cay]

        //olmayan bir indexi silmeye calisirsak ?
        //***System.out.println(urunler.remove(3));//IndexOutOfBoundsException


    }
}
