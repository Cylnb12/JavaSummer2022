package day47_Maps;

import day46_maps.ReusableMethods;

import java.util.Map;
import java.util.Set;

public class C04_Entry {
    public static void main(String[] args) {
        /*
        Java Entry<K,V> map in icerisinde bulunan her bir kaydi
        key=value seklinde tutar
        dolayisiyla herhangi bir entry e ulastigimizda
        hem key e hamde value ya ulasabilir
        ve istedigimiz islemleri yapabiliriz

        entry.getKey() bize Key i getirir
        entry.getValue() bize Value yu getirir
        entry.setValue() value yu istedigimiz deger olarak set(update) eder

         */
        Map<Integer,String> sinifListMap= ReusableMethods.mapOlustur();
        System.out.println(sinifListMap);

        //Map in her bir elemanini altalta yazdiralim

        Set<Map.Entry<Integer,String>> sinifEntrySet=sinifListMap.entrySet();
        for (Map.Entry<Integer,String> each:sinifEntrySet
             ) {
            System.out.println(each);

        }

        //Map in tum elemanlarinda varsa Tester Kurs ismini QA olarak degistirelim

        String eachValue;
        for (Map.Entry<Integer,String> each:sinifEntrySet
             ) {
            eachValue=each.getValue();
            eachValue=eachValue.replace("Tester","QA");
            each.setValue(eachValue);
        }
        System.out.println(sinifListMap);

    }

}
