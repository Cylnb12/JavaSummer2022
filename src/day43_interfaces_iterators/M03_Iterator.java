package day43_interfaces_iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class M03_Iterator {
    public static void main(String[] args) {

        List<Integer> liste=new ArrayList<>();
        liste.add(10);
        liste.add(20);
        liste.add(30);
        System.out.println(liste);

        //listedeki tum elementleri INDEX KULLANMADAN 3 artirin
        for (Integer each:liste
             ) {
            System.out.print(each+3+" ");
        }
        System.out.println();
        System.out.println(liste);

        /*
        Java index yapisi olmayan collectionlardaki elementlere ulasmak veya
        degistirmek icin iterator interface ini olusturmustur

        Iterator interface oldugundan ondan obje uretmemiz mumkun degildir
        bunun yerine bize iterator döndüren liste.listIterator(); kullaniyoruz
          */
        System.out.println(liste);

        Iterator it1= liste.listIterator();
        System.out.println(it1.next());
        System.out.println(it1.next());
        System.out.println(it1.next());
        //System.out.println(it1.next());//30 dan sonra element kalmadigindan next() RTE verir.

        // Iteratorde geri donus yok, adim adim sona ulastiktan sonra
        //basa gelmek isterseniz yeniden bir iterator olusturmamiz gerekir

        Iterator it2=liste.listIterator();
        // yeni iteratoru (it2) kullanarak listenin tum elementelrini silelim
        it2.next();
        it2.remove();

        it2.next();
        it2.remove();

        it2.next();
        it2.remove();
        System.out.println(liste);//iteratorle elementleri gezip remove yaptigimizda
                                    //liste kalici olarak degisti

        liste.add(10);
        liste.add(20);
        liste.add(30);
        System.out.println("yeniden liste "+liste);
        Iterator it3= liste.listIterator();
        while (it3.hasNext()){
            it3.next();
            it3.remove();
        }
        System.out.println("loop tan sonra yeniden liste "+liste);

        /*
        goruldugu gibi Iterator kullanarak yapabildigim
        1- tum collection elementlerini yazdirmak
        2- tum collection elementlerini silmek
        Bu da bize yetmez


         */








    }
}
