package lambda_functional_programming01;

import java.util.ArrayList;
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







    }
    //1) Tüm elemanları büyük harf ile yazdıran bir method oluşturun.
public static void buyukHarleYazdir(List<String>list){
        list.stream().map(String::toUpperCase).forEach(utils::ayniSatirdaBosluklaYazdir);
}


}
