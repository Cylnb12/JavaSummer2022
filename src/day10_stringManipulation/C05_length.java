package day10_stringManipulation;

public class C05_length {
    public static void main(String[] args) {

        String str= "Java ogren, isi kap";

        System.out.println(str.length());// str nin karakter sayisini dondurur

        System.out.println(str.charAt(str.length()-1));// son karakter
        System.out.println(str.charAt(str.length()-3)); // sondan 3. karakter


        /*
        java da null pointer bir deger degil,
        karsisina yazildigi variable in hicbir deger almadiginin isaretcisi dir

         */

        String str2="";//str2 ye deger atanmis midir   EVET
                        // bu deger : hicliktir
        String str3=null;// str3 e bir deger atanmis midir   HAYIR
                        // null bu deger atamamayi isaret etmektedir

        System.out.println(str2.length());

       // System.out.println(str3.length()); //deger atanmamis ne uzunlugu??? EXCEPTION


    }
}
