package day47_Maps;

import day46_maps.ReusableMethods;

import java.util.Map;

public class C01_DununTekrari {
    public static void main(String[] args) {

        Map<Integer,String> sinifListMap= ReusableMethods.mapOlustur();

        System.out.println(sinifListMap);
// Ogrenci listesini isim soyisim olarak yazdirin

        System.out.println(ReusableMethods.isimSoyisimListesiOlustur(sinifListMap));
        ReusableMethods.tumValueSiraliYazdir(sinifListMap);
        //Kac Farkli brans varsa bransismi: branstaki ogrenci sayisi

        ReusableMethods.bransOgrenciSayisiYazdir(sinifListMap);
    }

}
