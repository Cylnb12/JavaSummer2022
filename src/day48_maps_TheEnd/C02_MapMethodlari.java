package day48_maps_TheEnd;

import day46_maps.ReusableMethods;

import java.util.Map;

public class C02_MapMethodlari {
    public static void main(String[] args) {
        Map<Integer,String> sinifListMap=ReusableMethods.mapOlustur();

        ReusableMethods.entryYazdir(sinifListMap);
        sinifListMap.clear();

        System.out.println("Cleardan sonra map "+sinifListMap);

        sinifListMap=ReusableMethods.mapOlustur();
        System.out.println(sinifListMap.getOrDefault(104, "Aradiginiz key yok"));
        //Derya, Deniz, DevOps
        System.out.println(sinifListMap.getOrDefault(110, "Aradiginiz key yok"));
        //Aradiginiz key yok

        System.out.println(sinifListMap.isEmpty());//false

        System.out.println(sinifListMap.putIfAbsent(104, "Derya, Okyanus, Developer"));
        System.out.println(sinifListMap.putIfAbsent(108, "Aysun, Can, Devops"));
        ReusableMethods.entryYazdir(sinifListMap);

    /*
    sinifListMap a key 106 yoksa, value "Mevlut, Han, Tester"
    106 daha onceden varsa, eskiden varolan datayi degistirmek istedigimizden emin misiniz yazdirin

    106 nin oldugunu test etmek icin containsKey daha mantikli
    ama biz yeni ogrendigimiz method ile yapalim

    map.putIfAbsent(key,value)==> key varsa
    ekleme yapmaz bize o keyle kayitli olan value yu dondurur;

    ==> eger key daha onceden map e eklenmemisse
    eklemeyi yapar ve bize null dondurur


     */
        System.out.println(sinifListMap.putIfAbsent(106, "Mevlut, Han, Tester"));
        //Taha, Deiz, JDev
        //Eski degeri degistirmek istediginizden emin misiniz
        if (sinifListMap.putIfAbsent(106, "Mevlut, Han, Tester")==null){
            System.out.println("Girdi Kayit basatili");
        }else System.out.println("Eski degeri degistirmek istediginizden emin misiniz ");

        System.out.println(sinifListMap.putIfAbsent(109, "Mevlut, Han, Tester"));
        //109, "Mevlut, Han, Tester"
        ReusableMethods.entryYazdir(sinifListMap);

        System.out.println(sinifListMap.remove(106));//Taha, Deiz, JDev
        System.out.println(sinifListMap.remove(107,"Derya, Cem, Tester"));//silerse true silmezse false donduruyor


        sinifListMap.replace(105,"Erdal, Cifci, Tester");
        sinifListMap.put(109,"Cavidan, Eken, JDev");
        ReusableMethods.entryYazdir(sinifListMap);

        System.out.println(sinifListMap.size());



    }
}
