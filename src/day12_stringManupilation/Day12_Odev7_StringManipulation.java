package day12_stringManupilation;

import java.util.Scanner;

public class Day12_Odev7_StringManipulation {
    public static void main(String[] args) {

        // kullanıcıdan ismini,soy ismini ve kredi kartını alın ve asagıdakı gıbı yazdırın
// isim-soyisim:M***** B******
//kart no :************1234

       // Scanner scan = new Scanner(System.in);
//
       // System.out.println("lütfen isminizi giriniz");
       // String isim = scan.nextLine();
//
       // System.out.println("lütfen soyisminizi giriniz");
       // String soyisim = scan.nextLine();
//
       // System.out.println("lütfen kart numaranızı giriniz");
       // String kartNo = scan.nextLine();
//
//
       // String isimIlkHarf= isim.substring(0,1).toUpperCase();
       // String isimGeriyeKalanlar=isim.substring(1).replaceAll("\\w","*");
       // String soyisimIlkHarf=soyisim.substring(0,1).toUpperCase();
       // String soyisimGeriyeKalanlar= soyisim.substring(1).replaceAll("\\w","*");
       // String kkson4=kartNo.substring(kartNo.length()-4);
       // String kkgeriyekalan= "**** **** **** ";
//
       // System.out.println(isimIlkHarf+isimGeriyeKalanlar+" "+
       //         soyisimIlkHarf+soyisimGeriyeKalanlar+ "\n" +kkgeriyekalan+
       //         kkson4);


        String ad="Mehmet Asaf";
        String soyad="asdasds";
        String kartNo="1234123412341234";

        int a=ad.indexOf(" ");
        int b=a+1;
        String adIlkHarf=ad.substring(0,1).toUpperCase();
        String adKalan=ad.substring(1,b).replaceAll("\\w","*");

        String ikinciAd=ad.substring(b,b+1).toUpperCase();
        String ikinciAdKalan=ad.substring(b+1).replaceAll("\\w","*");



        String soyadIlkHarf=soyad.substring(0,1).toUpperCase();
        String soyadKalan=soyad.substring(1).replaceAll("\\w","*");

        String kkSon4=kartNo.substring(kartNo.length()-4);
        String kkgerisi="**** **** **** ";


        System.out.println(adIlkHarf+adKalan+"  "+ikinciAd+ikinciAdKalan+"  "+soyadIlkHarf+soyadKalan+"\n"+kkgerisi+kkSon4);

    }
}
