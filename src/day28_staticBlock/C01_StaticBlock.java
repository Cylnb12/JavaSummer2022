package day28_staticBlock;

public class C01_StaticBlock {

    static int sayi;
    static {
        /*
        static block class uyelerinin tamamindan once calisir
        (mainm method'dan bile once)

        staticblock class olusturuldugunda calisir
        genellikle de class ile ilgili on ayarlamalar veya
        static variable lara deger atamaak icin kullanilir

        static blocklarin class icerisinde nerede oldugu onemli degildir
        once staticblock lar calisir

        birden fazla static block varsa yukaridan asagi dogru calisir



         */
        System.out.println("static block calisti");
        sayi=10;

    }

    public static void main(String[] args) {
        System.out.println("main method calisti");
        System.out.println(sayi);





    }
    static {
        System.out.println("main method altindaki staticblock calisti");
    }
}
