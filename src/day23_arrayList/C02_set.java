package day23_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_set {
    public static void main(String[] args) {

        /*
        elimizde urunlerin bulundugu bir liste var
        urun listesindeki istenen siradaki urunu
        istedigimiz yeni urun  ile degistirip
        eski urunu, var olan eski urunler listesine
        ekleyelim
         */

        List<String> urunler=new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cerkirdek");
        urunler.add("Cay");

        List<String> eskiUrunler=new ArrayList<>();
        //Litedeki ikramin yerine biskrem koyalim
        // ikrami da eski urunler listemize ekleyelim

        String yeniUrun="Biskrem";
        String silinecekUrun="Ikram";

        int temp=urunler.indexOf("Ikram");
        System.out.println(urunler.indexOf("Ikram"));

        String silnenUrun=urunler.set(temp,yeniUrun);

        eskiUrunler.add(silnenUrun);
        System.out.println("Liste : "+urunler);
        System.out.println("eski urunler listesi : "+eskiUrunler);

         yeniUrun="Cay";
         silinecekUrun="Ikram";

         temp=urunler.indexOf("Cay");
        System.out.println(urunler.indexOf("Cay"));

         silnenUrun=urunler.set(temp,yeniUrun);

        eskiUrunler.add(silnenUrun);
        System.out.println("Liste : "+urunler);
        System.out.println("eski urunler listesi : "+eskiUrunler);






    }
}
