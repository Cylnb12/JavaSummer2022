package day12_stringManupilation;

public class C03_substring {
    public static void main(String[] args) {

        String isim="Suleyman";
        String soyisim="Karanfil";
        String kartNo="1234 6589 7458 9658";

        System.out.println(isim.substring(3));// eyman
        System.out.println(soyisim.substring(soyisim.length()-3));//fil

        System.out.println(isim.substring(2,4));//le

        //isim ve soyismin ilk harfi buyuk harf geriye kalan *
        //kredi kartinin ilk dort rakami gorunsun geriye kalan *

        String isimilkHarf=isim.substring(0,1).toUpperCase();
        String isimGeriyeKalanlar=isim.substring(1).replaceAll("\\w","*");

        String soyisimIlkHarf=soyisim.substring(0,1).toUpperCase();
        String soyisimGeriyeKalan=soyisim.substring(1).replaceAll("\\w","*");

        String kkIlk4=kartNo.substring(0,4);
        String kkGeriyeKalanlar=" **** **** ****";

        System.out.println(isimilkHarf+isimGeriyeKalanlar+" "+
                soyisimIlkHarf+soyisimGeriyeKalan+" \n"+kkIlk4+kkGeriyeKalanlar);





    }
}
