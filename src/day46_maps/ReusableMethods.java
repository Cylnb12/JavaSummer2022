package day46_maps;

import java.util.*;

public class ReusableMethods {

    public static Map<Integer,String> mapOlustur(){
        Map<Integer,String> sinifMap=new HashMap<>();
        sinifMap.put(101,"Ali, Can, JDev");
        sinifMap.put(102,"Enes, Cem, Tester");
        sinifMap.put(104,"Derya, Deniz, DevOps");
        sinifMap.put(103,"Taha, Emre, JDev");
        sinifMap.put(105, "Enes, Can, Tester");
        sinifMap.put(106, "Taha, Deiz, JDev");
        sinifMap.put(107, "Derya, Cem, Tester");


        return sinifMap;
    }


    public static void tumValueSiraliYazdir(Map<Integer, String> ogrenciMap) {

        String[] eachArr;
        int sira=1;
        for (String each: ogrenciMap.values()
        ) {
            //buradaki each bize her bir ogrenciye ait ayni yapidaki
            //isim,bosluk, brans bilgilerini iceren bilgiler getiriyor
            eachArr=each.split(", ");
            System.out.println(sira+"-"+ Arrays.toString(eachArr));
            sira++;
        }


    }

    public static List<String> isimSoyisimListesiOlustur(Map<Integer, String> ogrenciMap) {
        String[] eachArr;
        List<String> methoddakiList=new ArrayList<>();
        int sira=1;
        for (String each: ogrenciMap.values()
        ) {

            eachArr=each.split(", ");
            methoddakiList.add(eachArr[0]+" "+eachArr[1]);
            sira++;
        }
        return methoddakiList;
    }


    public static void bransOgrenciSayisiYazdir(Map<Integer, String> sinifListMap) {

        //Brans=BranstakiOgrenciSayisi
        Map<String ,Integer> bransOgrSayiMap=new TreeMap<>();

        Collection<String> valuesCollection=sinifListMap.values();
        String[] valueArr;
        String brans;
        Integer bransdakiOgrSayisi;
        for (String each:valuesCollection
             ) {
            valueArr=each.split(", ");
            brans=valueArr[2];

            //Brans in bransOgrSayiMap inde key olarak daha onceden eklenip eklenmedigini kontrol etmeliyiz
            if (!bransOgrSayiMap.containsKey(brans)){
                bransOgrSayiMap.put(brans,1);
            }else {
                bransdakiOgrSayisi=bransOgrSayiMap.get(brans);
                bransOgrSayiMap.put(brans,++bransdakiOgrSayisi);

            }

        }
        System.out.println(bransOgrSayiMap);


    }

    public static void entryYazdir(Map<Integer, String> sinifListMap) {
        Set<Map.Entry<Integer,String>> SinifListEntrySeti=sinifListMap.entrySet();
        for (Map.Entry<Integer, String> entry:SinifListEntrySeti
             ) {
            System.out.println(entry);
        }

    }
}
