package lambda_functional_programming01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp02 {
    /*
1)  t-> "Logic" , (t, u)-> "Logic"
    Bu yapıya "Lambda Expession"
2) Functional Programming kapsamında "Lambda Expession" kullanılabilir ama önerilmez.
   "Lambda Expession" yerine "Method Reference" tercih edilir.
3) "Method Reference" kullanımı "Class Name :: Method Name"

   Aynı zamanda kendi class'larınızı da kullanabilirsiniz.
   Örneğin bir Animal class'ınız var ve bu class "eat()" methoduna sahip ==> "Animal :: eat"
 */
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
        listElemanlariniYazdirma(liste);
        System.out.println();
        ciftElemanlariYazdir(liste);
        System.out.println();
        TekElemanlariYazdir(liste);
        System.out.println();
        TekrarsızTekElemanlarinKupu(liste);
        System.out.println();
        tekrarsizCiftKarelerToplamiver(liste);
        tekrasizCiftElemanlarinKuplerininCarpimi(liste);
        getMax(liste);
        yedidenBuyukCiftMi(liste);
        bestenBuyukElemanlariYariyaBol(liste);


    }

    //1) Ardışık list elemanlarını
    // aynı satırda aralarında boşluk bırakarak yazdıran
    // bir method oluşturun.(Functional ve method reference)
    public static void listElemanlariniYazdirma(List<Integer> list) {
        list.stream().forEach(utils::ayniSatirdaBosluklaYazdir);
    }

    //2)Ardışık çift list elementlerini aynı satırda aralarında
// boşluk bırakarak yazdıran bir method oluşturun.(Functional)
    public static void ciftElemanlariYazdir(List<Integer> list) {
        list.stream().sorted().filter(utils::CiftleriAl).forEach(utils::ayniSatirdaBosluklaYazdir);
    }

    //3) Ardışık tek list elemanlarının karelerini aynı satırda aralarında
// boşluk bırakarak yazdıran bir method oluşturun.(Functional)
    public static void TekElemanlariYazdir(List<Integer> list) {
        list.stream().sorted().filter(utils::tekElemanSec).map(utils::kareal).forEach(utils::ayniSatirdaBosluklaYazdir);
    }

    //4) Ardışık tek list elemanlarının küplerini tekrarsız olarak aynı satırda
// aralarında boşluk bırakarak yazdıran bir method oluşturun.
    public static void TekrarsızTekElemanlarinKupu(List<Integer> list) {
        list.stream().sorted().distinct().filter(utils::tekElemanSec).map(utils::kupunuAl).forEach(utils::ayniSatirdaBosluklaYazdir);
    }

    //5) Tekrarsız çift elemanların
// karelerinin toplamını hesaplayan bir method oluşturun.
    public static void tekrarsizCiftKarelerToplamiver(List<Integer> list) {
        Integer toplam = list.stream().distinct().filter(utils::CiftleriAl).map(utils::kareal).reduce(Math::addExact).get();
        System.out.println("çift kareler toplam = " + toplam);
    }

    //6) Tekrarsız çift elemanların küpünün çarpımını hesaplayan
// bir method oluşturun.
    public static void tekrasizCiftElemanlarinKuplerininCarpimi(List<Integer> list) {
        Integer carp = list.stream().distinct().filter(utils::CiftleriAl).map(utils::kupunuAl).reduce(1, Math::multiplyExact);
        System.out.println("carpim sonucu = " + carp);
    }
//7) List elemanları arasından en büyük değeri bulan bir method oluşturun.
    public static void getMax(List<Integer>list){
        Integer max =list.stream().distinct().reduce(Integer.MIN_VALUE,Math::max);
        System.out.println("max = " + max);
    }
//Ödev
    //8)List elemanları arasından en küçük değeri bulan bir method oluşturun.(Method Reference)9:09
//9) List elemanları arasından 7'den büyük, çift, en küçük değeri bulan bir method oluşturun.
public static void yedidenBuyukCiftMi(List<Integer>list){
     Integer min=   list.stream().distinct().filter(t->t>7).filter(utils::CiftleriAl).reduce(Math::min).get();
    System.out.println("min = " + min);
}
//10) Ters sıralama ile tekrarsız ve
// 5'ten büyük elemanların yarı değerlerini(elamanın ikiye bölüm sonucunu) bulan bir method oluşturun.
public static void bestenBuyukElemanlariYariyaBol(List<Integer>list){
      List<Double> yari = list.stream().distinct().sorted(Comparator.reverseOrder()).filter(t->t>5).map(utils::yariyaBol).collect(Collectors.toList());
    System.out.println("yari = " + yari);
}

}
