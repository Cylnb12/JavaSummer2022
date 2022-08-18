package lambda_functional_programming01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp01 {
    /* 1- Lambda (Functional programing java 8 ile kullanılmaya baslanır)
    2-Functional Programing de ne yapılacak (what to do)uzerine yogunlasılacak
    3-Structured programing nasıl yapılacak uzerine yogunlasırlar(how to do)
    4-Functional Programing arrays ve collections ile kullanılır
    5-entryset() metodu ile map set e dönüştürülerek kullanılır.

    * */
    public static void main(String[] args) {
        List<Integer> liste = new ArrayList<>();
        liste.add(8);
        liste.add(9);
        liste.add(131);
        liste.add(10);
        liste.add(9);
        liste.add(10);
        liste.add(2);
        liste.add(8);

        System.out.println(liste);
        listElamanlariniYazdirStructured(liste);
        System.out.println();
        listElamanlariniYazdirFunctional(liste);
        System.out.println();
        CiftElamanlariYazdirStructured(liste);
        System.out.println();
        System.out.println("Functional metotla bulum");
        CiftElamanlariYazdirFunctional(liste);
        System.out.println();
        TekElemanlarinKareleriYazdirFunctional(liste);
        System.out.println();
        tekrarsizTekElamanlarinKupunuYazdir(liste);
        System.out.println();
        tekrarsizCiftElemanlarinKareToplami(liste);
        System.out.println();
        tekrarsizCiftElemanlarKupuCarpmasi(liste);
        System.out.println();
        ElemanlarinEnBuyukDegeriniBulan(liste);
        getMaxEleman01(liste);
        YedidenBuyukCiftMin(liste);
        YedidenBuyukCiftMin1(liste);
        YedidenBuyukCiftMin2(liste);
        tersSiralamaİleYaridegerBulma(liste);

    }

    ///1) Ardışık list elementlerini aynı satırda aralarında
    // boşluk bırakarak yazdıran bir method oluşturun.(Structured)
    public static void listElamanlariniYazdirStructured(List<Integer> list) {
        for (Integer w : list) {
            System.out.print(w + " ");

        }


    }

    //) Ardışık list elementlerini aynı satırda aralarında
//    // boşluk bırakarak yazdıran bir method oluşturun.(Functional)
    public static void listElamanlariniYazdirFunctional(List<Integer> list) {
        list.stream().forEach(t -> System.out.print(t + " "));


    }

    //2)çift list elementlerini aynı satırda
// aralarında boşluk bırakarak yazdıran bir method oluşturun.(Structured)
    public static void CiftElamanlariYazdirStructured(List<Integer> list) {
        for (Integer w : list
        ) {
            if (w % 2 == 0) {
                System.out.print(w + " ");
            }

        }
//2)çift list elementlerini aynı satırda
// aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)

    }

    public static void CiftElamanlariYazdirFunctional(List<Integer> list) {
        list.stream().filter(t -> t % 2 == 0).forEach(t -> System.out.print(t + " "));
    }

    //3) Ardışık tek list elementlerinin
// karelerini aynı satırda aralarında boşluk
// bırakarak yazdıran bir method oluşturun.(Functional)
    public static void TekElemanlarinKareleriYazdirFunctional(List<Integer> list) {
        list.stream().filter(t -> t % 2 != 0).map(t -> t * t).forEach(t -> System.out.print(t + " "));
        //elemanlarin degerleri degisecekse map kullan
    }

    //4) Ardışık tek list elementlerinin
// kuplerii tekrarsiz olarak aynı satırda aralarında boşluk
// bırakarak yazdıran bir method oluşturun.(Functional)
    public static void tekrarsizTekElamanlarinKupunuYazdir(List<Integer> list) {
        list.stream().distinct().filter(t -> t % 2 != 0).map(t -> t * t * t).forEach(t -> System.out.print(t + " "));
    }

    //5) Tekrarsız çift elementlerin karelerinin toplamını hesaplayan bir method oluşturun.
    public static void tekrarsizCiftElemanlarinKareToplami(List<Integer> list) {
        Integer toplam = list.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t).reduce(0, (t, u) -> t + u);
        System.out.println(toplam);

    }

    //6) Tekrarsız çift elemanların küpünün çarpımını hesaplayan bir method oluşturun.
    public static void tekrarsizCiftElemanlarKupuCarpmasi(List<Integer> list) {
        Integer carpim = list.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t * t).reduce(1, (t, u) -> t * u);
        System.out.print(carpim);
    }

    //7) List elemanları arasından en büyük değeri bulan bir method oluşturun.
    public static void ElemanlarinEnBuyukDegeriniBulan(List<Integer> list) {
        Integer max = list.stream().distinct().reduce(Integer.MIN_VALUE, (t, u) -> t > u ? t : u);
        System.out.println(max);
    }

    //2.yol:
    public static void getMaxEleman01(List<Integer> list) {
        Integer max = list.stream().distinct().sorted().reduce(Integer.MIN_VALUE, (t, u) -> u);
        System.out.println("max = " + max);
    }
//Ödev
    // !!! //8)List elemanları arasından en küçük değeri bulan bir method oluşturun.(2 Yol ile)

    //9) List elemanları arasından 7'den büyük, çift, en küçük değeri bulan bir method oluşturun.
    public static void YedidenBuyukCiftMin(List<Integer> list) {
        Integer min = list.stream().distinct().filter(t -> t % 2 == 0).filter(t -> t > 7).reduce(Integer.MAX_VALUE, (t, u) -> t < u ? t : u);
        System.out.println("min = " + min);
    }

    //2.yol:
    public static void YedidenBuyukCiftMin1(List<Integer> list) {                                  //alttaki buyukten kucuge sıralar
        Integer min = list.stream().distinct().filter(t -> t % 2 == 0).filter(t -> t > 7).sorted(Comparator.reverseOrder()).reduce(Integer.MAX_VALUE, (t, u) -> u);
        System.out.println("min = " + min);
    }

    //3.yol:
    public static void YedidenBuyukCiftMin2(List<Integer> list) {
        Integer min = list.stream().
                filter(t -> t % 2 == 0).
                filter(t -> t > 7).
                sorted().
                findFirst().
                get();
        System.out.println("min = " + min);
    }

    //10) Ters sıralama ile tekrarsız
// ve 5'ten büyük elemanların
// yarı değerlerini(elamanın ikiye bölüm sonucunu)
// bulan bir method oluşturun.
    public static void tersSiralamaİleYaridegerBulma(List<Integer> list) {

        List<Double> sonuc = list.stream().
                distinct().
                filter(t -> t > 5).
                map(t -> t / 2.0).
                sorted(Comparator.reverseOrder()).
                collect(Collectors.toList());
        System.out.println("sonuc = " + sonuc);
    }


}
