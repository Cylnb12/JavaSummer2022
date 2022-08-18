package hafta1Tekrar;

import java.util.Scanner;

public class Hafta1_Day01_02_03 {
    public static void main(String[] args) {

        byte a= 10;
        char b='b';
        boolean gercektenMi=true;
        short c=20;
        long d = 30;
        int e=40;
        float f=50f;
        double g=60.60;

        String h="Bak Iste!!";

        System.out.println("a: "+a+"  b: "+b+"  c: "+c+"  d: "+d+"e:  "+e+"  f: "+f+"  g: "+g+"  h: "+h);

        System.out.println(b+a);// sout icinde matematiksel islem oldugu icin ascii degerini kullaniyor
        System.out.println(""+b+a);// bastaki double quote yazisal ifade oldugu icin yazildigi gibi gosteriyor

        int p = 50;
        int r = 60;
        int s = 0;

        s=p;
        p=r;
        r=s;

        System.out.println("p  :"+p);
        System.out.println("r  :"+r);

        p=p+r;
        r=p-r;
        p=p-r;

        System.out.println("p  :"+p);
        System.out.println("r  :"+r);

        Scanner scan =new Scanner(System.in);

        System.out.println("Lutfen Adinizi Ve Soyadinizi Giriniz :  ");

        String kullaniciAdiSoyadi= scan.nextLine();

        System.out.println("Kullanici Adiniz :  "+ kullaniciAdiSoyadi.toUpperCase());
        char kullanici=scan.next().toUpperCase().charAt(0);
        System.out.println("Kullanici Adi ilk Harfiniz : " + kullanici);

        System.out.println("Sirayla 3 Sayi Giriniz Ve Her Seferinde Enter'e Basiniz");
        System.out.println("Sayi1  :");
        int sayi1=scan.nextInt();
        System.out.println("Sayi2  :");
        int sayi2=scan.nextInt();
        System.out.println("Sayi3  :");
        int sayi3=scan.nextInt();


        System.out.println("Sayi1+Sayi2+Sayi3 Toplami    : "+(sayi1+sayi2+sayi3));
        System.out.println("Sayi1+Sayi2+Sayi3 Ortalamasi : "+(sayi1+sayi2+sayi3)/3);
        System.out.println("Sayi1+Sayi2+Sayi3 Carpimi    : "+sayi1*sayi2*sayi3);


















    }
}
