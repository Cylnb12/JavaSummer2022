package day22_multiDimensionalArray;

import java.util.ArrayList;
import java.util.List;

public class C06_List {

    public static void main(String[] args) {

        /*
        array i array yapan sembol [] idi
        arrayList de ise <> diamond(elmas) kullaniriz
         */
        List<String> isimler=new ArrayList<>();
        System.out.println(isimler);// []

        // bir list e eleman eklemek istersek
        isimler.add("Basak");
        System.out.println(isimler.add("ayse"));
        System.out.println(isimler);// [Basak, ayse]
        /*
        String debir metod calistirdigimizda
         assign yapmazsak String degismiyordu

         String isim="Suleyman";
         isim.toUpperCase();// sadece bu satir icin SULEYMAN
         sout--> Suleyman


            list lerde assign etmesek bile method calisir ve verileri ekler
         */
        /*
        list in tek kotu tarafi Array alt yapisi kullandigi icin
        elemanlari birer birer eklemek zorunda olmalidir.

         */


    }
}
