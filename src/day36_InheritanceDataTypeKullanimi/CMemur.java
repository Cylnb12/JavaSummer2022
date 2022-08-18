package day36_InheritanceDataTypeKullanimi;

import java.util.ArrayList;

public class CMemur extends BMuhasebe {

    protected int saatUcreti=12;
    protected int gunlukMesai=9;

    protected void maas(){
        System.out.println("Memurlar  : "+(30*gunlukMesai*saatUcreti)+" maas alir");
    }
    protected void ozelSigorta(){
        System.out.println("Memurlar %60 indirimli sigorta yaptirabilirler");
    }


    public static void main(String[] args) {

        CMemur mmr1=new CMemur();
        System.out.println(mmr1.gunlukMesai);//9
        System.out.println(mmr1.saatUcreti);//12
        mmr1.maas();
        mmr1.ozelSigorta();
        mmr1.sigorta();//personel den alacak
        System.out.println(mmr1.isim);//personel den alacak
        System.out.println(mmr1.soyisim);//personel den alacak
        System.out.println(mmr1.departman);//personel den alacak

        BMuhasebe mhsb1=new BMuhasebe();

        /*
        her ne kadar memur class inin icinde olsakda
        olusturdugum obje BMuhasebe class indan
        cunku data turu ve constructor BMuhasebe

        String str="Murat";
        ArrayList<Integer> list=new ArrayList<>();
        Integer sayi=20;
        BMuhasebe class i da obje olusturulabilen bir classdir
        yani ayni zamanda data turudur


         */
        System.out.println("\n");

        System.out.println(mhsb1.gunlukMesai);//8  Muhasebe
        System.out.println(mhsb1.saatUcreti);//10  Muhasebe
        mhsb1.maas();//  Muhasebe //Personel minimum : 2400 maas alir
        mhsb1.ozelSigorta();// Muhasebe //Isteyen calisanlara %50 indirimli ozel sigorta yapilir
        mhsb1.sigorta();// Personel den alacak// Tum personelimiz sigorta yapilir
        System.out.println(mhsb1.isim);// Personel den alacak
        System.out.println(mmr1.soyisim);// Personel den alacak
        System.out.println(mmr1.departman);// Personel den alacak

    }
}
