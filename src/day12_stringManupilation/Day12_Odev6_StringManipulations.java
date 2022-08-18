package day12_stringManupilation;

import java.util.Scanner;

public class Day12_Odev6_StringManipulations {
    public static void main(String[] args) {



      //  Scanner scan=new Scanner(System.in);
      //  System.out.println("Lutfen bir sifre giriniz: ");
      //  String sifre=scan.nextLine();


    //  String sifre="asd";

    // String ilkHarf=sifre.substring(0,1);
    // String ilkHarfBuyuk=sifre.substring(0,1).toUpperCase();

    // String sonHarf=sifre.substring(sifre.length()-1);
    // String sonHarfKucuk=sifre.substring(sifre.length()-1).toLowerCase();


    // String boslukSifre=sifre.replaceAll("\\s","");

    // if(ilkHarf.equals(ilkHarfBuyuk) &&
    //         sonHarf.equals(sonHarfKucuk)
    //         && sifre.equals(boslukSifre)
    //         &&sifre.length()>=8){
    //     System.out.println("Sifre basari ile tanimlandi");
    // }else{
    //     System.out.println("Islem basarisiz,Lutfen yeni bir sifre girin");
    // }


        String sifre="Asdfas";

        String ilk=sifre.substring(0,1);
        String ilkHarf=sifre.substring(0,1).toUpperCase();

        String son=sifre.substring(sifre.length()-1);
        String sonHarf=sifre.substring(sifre.length()-1).toLowerCase();

        String bosluksuz=sifre.replaceAll("\\s", "");

        if (ilk.equals(ilkHarf)&&son.equals(sonHarf)&&
                bosluksuz.length()==(sifre.length())&&
                sifre.length()>=8){
            System.out.println("isleminiz gayet basarili");
        }else {
            System.out.println("Isleminiz basarisiz");
        }






    }
}
