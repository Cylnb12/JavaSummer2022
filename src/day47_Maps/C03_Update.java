package day47_Maps;

import day46_maps.ReusableMethods;

import java.util.*;

public class C03_Update {
    public static void main(String[] args) {

        /*
        map.contains(key)==> verdigimiz key in map de olup olmadigini boolean olarak doner
        map.contains(value)==> Bir butun olarak valuenun map de olup olmadigini doner

        ONEMLI NOT : map.contains()value value nin icindeki bi parcayi bulmada ise yaramaz
                    Eger value icindeki bir parcayi aratmak istiyorsak
                     map uzerinde map uzerinde manipulation yapmamiz lazim

                     map.get(key)==> verilen key e ait value yu dondurur
          */
        Map<Integer,String> sinifLIstMap= ReusableMethods.mapOlustur();

        System.out.println(sinifLIstMap);

        System.out.println(sinifLIstMap.containsKey(104));//true
        System.out.println(sinifLIstMap.containsKey(114));//false

        System.out.println(sinifLIstMap.containsValue("Ali, Can, JDev"));//true
        System.out.println(sinifLIstMap.containsValue("JDev"));//false


        //Verilen Map de JDev degerlerini JavaDeveloper  olarak degistirelim
        //Maplerde replace yok tum value yu degistirmek istersek kullanilabiir
        //kismi degisikliklerde kullanamayiz

      ReusableMethods.tumValueSiraliYazdir(sinifLIstMap);
      // Map i guncellemek icin key, yenidegeri map a eklemeliyiz
        //ornegin key 101 icin value [Ali, Can, JDev]
        //guncelleme icin siniflistesiMap.put(101, Ali, Can, JavaDeveloper)

        //bunu yapabilmek icin her bir key e ve ona ait value ya ihtiyacim var
        String eachValue;
        Set<Integer> keySeti=sinifLIstMap.keySet();
        for (Integer each:keySeti
             ) {
            eachValue=sinifLIstMap.get(each);
            eachValue=eachValue.replace("JDev","JavaDeveloper");
            sinifLIstMap.put(each,eachValue);
            /*
            biz keylerin tamamini aldik
            herbir key in value sunu getirdik
            value uzerindeki degisikligi yapip
            yeni halini put(key,yeniDeger) ile Map e koyduk
             */
        }




        System.out.println(sinifLIstMap);

    }
}
