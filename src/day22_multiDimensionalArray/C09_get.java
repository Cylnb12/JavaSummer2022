package day22_multiDimensionalArray;

import java.util.ArrayList;
import java.util.List;

public class C09_get {

    public static void main(String[] args) {

        List<Integer> sayilar1=new ArrayList<>();
        sayilar1.add(5);
        sayilar1.add(3);
        sayilar1.add(2);

        List<String> isimler=new ArrayList<>();
        isimler.add("erdal");
        isimler.add("hakan");
        isimler.add("enes");


        System.out.println(isimler.get(2));
        System.out.println(sayilar1.get(1));



    }
}
