package lambda_functional_programming01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp03 {
    public static void main(String[] args) {
        List<String> liste = new ArrayList<>();
        liste.add("Ali");
        liste.add("Ali");
        liste.add("Mark");
        liste.add("Amanda");
        liste.add("Christopher");
        liste.add("Jackson");
        liste.add("Mariano");
        liste.add("Alberto");
        liste.add("Tucker");
        liste.add("Benjamin");
        System.out.println(liste);


        buyukHarleYazdir(liste);
        System.out.println();
        uzunlugaGoreYazdir(liste);
        System.out.println();
        uzunlugaGoreTersYzdir(liste);
        System.out.println();
        sonKaraktereGoreSiralaYazdir(liste);
        System.out.println();
        uzunlukVeİlkHrfeGoreSiralaYazdir(liste);
        System.out.println();
        //  bestenBuyukElemanlariSil(liste);
        //  baslagiciAYadaSonuNOlanisil(liste);
      //  uzunlugu8ile10arasiveOIleBiteniSil(liste);
        System.out.println("uzunlugu 12 den az mı? "+elemanlarininUzunlugu12denAzOlanlar(liste));
        System.out.println("x ile basliyor mu? "+xİleBaslamıyorMu(liste));
        System.out.println("r ile biten var mi? "+rileBitiyormu(liste));


    }

    //1) Tüm elemanları büyük harf ile yazdıran bir method oluşturun.
    public static void buyukHarleYazdir(List<String> list) {
        list.stream().map(String::toUpperCase).forEach(utils::ayniSatirdaBosluklaYazdir);
    }

    //2) Elemanları uzunluklarına göre sıralayıp yazdıran bir method oluşturun.
    public static void uzunlugaGoreYazdir(List<String> list) {
        list.
                stream().
                sorted(Comparator.comparing(String::length)).
                forEach(utils::ayniSatirdaBosluklaYazdir);
    }

    //3) Elemanları uzunluklarına göre ters sıralayıp yazdıran bir method oluşturun.
    public static void uzunlugaGoreTersYzdir(List<String> list) {
        list.
                stream().
                sorted(Comparator.comparing(String::length).reversed()).
                forEach(utils::ayniSatirdaBosluklaYazdir);
    }

    //4) Elemanları son karakterlerine göre sıralayıp tekrarsız yazdıran bir method oluşturun.
    public static void sonKaraktereGoreSiralaYazdir(List<String> list) {//Comparator.comparing() sıralama kodu
        list.stream().distinct().sorted(Comparator.comparing(utils::sonKarakteriAl)).forEach(utils::ayniSatirdaBosluklaYazdir);
    }

    //5) Elemanları önce uzunluklarına göre ve sonra ilk karakterine göre sıralayıp yazdıran bir method oluşturun.
    public static void uzunlukVeİlkHrfeGoreSiralaYazdir(List<String> list) {
        list.stream().sorted(Comparator.comparing(String::length).thenComparing(utils::ilkKarakteriAl)).forEach(utils::ayniSatirdaBosluklaYazdir);
    }

    //6) Uzunluğu 5'ten büyük olan elemanları silen bir method oluşturun.
    //  public static void bestenBuyukElemanlariSil(List<String>list){
    //    list.removeIf(t->t.length()>5);
    //  System.out.println("list = " + list);
//7) ‘A’, ‘a’ ile başlayan yada ‘N’, ‘n’ ile biten elemanları silen bir method oluşturun.
    //1.yol:
    //   public static void baslagiciAYadaSonuNOlanisil(List<String>list){
    // list.removeIf(t->t.charAt(0)=='A'||t.charAt(0)=='a'||t.charAt(t.length()-1)=='N'||t.charAt(t.length()-1)=='n');
    //   System.out.println(list);
    //2.yol:
    // public static void baslagiciAYadaSonuNOlanisil(List<String>list){
    //   list.removeIf(t->t.startsWith("A")||t.startsWith("a")||t.endsWith("N")||t.endsWith("n"));
    // System.out.println(list);
    //8) Uzunluğu 8 ile 10 arası olan yada 'o' ile biten elemanları silen bir method oluşturun.
    //public static void uzunlugu8ile10arasiveOIleBiteniSil(List<String> list) {

       // list.removeIf(t -> (t.length() > 7 && t.length() < 11) || t.endsWith("o"));
       // System.out.println(list);
//9) Tüm elemanların uzunluklarının 12'den az olup olmadığını kontrol eden bir method oluşturun.
    public static boolean elemanlarininUzunlugu12denAzOlanlar(List<String>list){
        return list.stream().allMatch(t->t.length()<12);
    }
//10) Hiçbir elemanın 'X' ile başlamadığını kontrol eden bir method oluşturun.
    public static boolean xİleBaslamıyorMu (List<String>list){
        return list.stream().noneMatch(t->t.startsWith("X"));
    }
//11) Herhangi bir elemanın 'r' ile bitip bitmediğini kontrol eden bir method oluşturun.
    public static boolean rileBitiyormu(List<String>list){
        return list.stream().anyMatch(t->t.startsWith("r"));
    }




    }










