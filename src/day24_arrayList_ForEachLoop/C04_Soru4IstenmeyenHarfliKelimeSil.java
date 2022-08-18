package day24_arrayList_ForEachLoop;

import java.util.Arrays;

public class C04_Soru4IstenmeyenHarfliKelimeSil {
    public static void main(String[] args) {

        //Verilen bir array de istenmeyen harf iceren kelimeleri silip
        // kalan elementleri bir araya getiren yeni bir array yapin


        String[] isimler={"Erdal","Mihrican1","Onur","Mihrican1","Mehmet","Hayrullah","Hayrullah","Mihrican1","Hayrullah"};


        String unwanted="n";
        String preArray="";

        for (int i = 0; i < isimler.length; i++) {
            if (!isimler[i].contains(unwanted)){
                preArray+=isimler[i]+" ";

            }
        }
        String[] newArray=preArray.split(" ");
        System.out.println(Arrays.toString(newArray));



    }
}
