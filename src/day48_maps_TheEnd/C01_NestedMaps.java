package day48_maps_TheEnd;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C01_NestedMaps {
    /*
    eger bir elementle ilgili tutacagimiz bilgiler coksa veya kompleks ise
    bu defa ic ice map kullanmayi tercih edebiliriz

    ic ice map kullandiginizda daha fazla detayi,
    daha duzenli olarak tutma imkanimiz olur.
    Ancak, bilgiye ulasmak ve manipule etmek biraz zor olabilir

    Ornek olarak dunku map imizi maplerden olusan bir map olarak olusturalim
        sinifMap.put(no=102, isim=Enes, soyisim=Cem, brans=Tester");
        sinifMap.put(101,"Ali, Can, JDev");
        sinifMap.put(104,"Derya, Deniz, DevOps");
     */

    public static <ogrNestedMap> void main(String[] args) {
        Map<String,String> ogr101=new HashMap<>();

        ogr101.put("isim","enes");
        ogr101.put("soyisim","Cem");
        ogr101.put("Brans","Tester");

        Map<String,String> ogr102=new HashMap<>();

        ogr102.put("isim","Taha");
        ogr102.put("soyisim","Emre");
        ogr102.put("Brans","JDev");

        Map<String,String> ogr103=new HashMap<>();

        ogr103.put("isim","Derya");
        ogr103.put("soyisim","Deniz");
        ogr103.put("Brans","DevOps");


        Map<Integer,Map<String,String> > ogrenciNestedMap=new HashMap<>();

        ogrenciNestedMap.put(101,ogr101);
        ogrenciNestedMap.put(102,ogr102);
        ogrenciNestedMap.put(103,ogr103);



        Set<Map.Entry<Integer, Map<String, String>>> ogrenciEntrySeti = ogrenciNestedMap.entrySet();

        for (Map.Entry each:ogrenciEntrySeti
             ) {

            System.out.println(each);
        }
        //102 nolu kisinin ismini yazdiralim
        System.out.println(ogrenciNestedMap.get(102).get("isim"));

        

    }

}
