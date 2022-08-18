package day40_final;


public class A {

    String isim ="Cuneyt";
   final static String  OKUL="Yildiz Koleji";
   /*
   Bir variable final olarak tanimlandiysa
   baska classlardan veya icinde oldugumuz class dan bu variable a
    baska deger atanmasi mumkun degildir
    */

    /*
    Madem ki degeri degistirilemiyor
    genelde static de yaparak
    bu variable in erisimi kolaylastirilir

    ve genelde static final olarak belirlenen variable isimleri BUYUK HArfle yazilir

     */

    final void finaMethod(){
        System.out.println("Final methodlar override edilemez");
        /*
        Bir methodu final olarak isaretlerseniz
        bu method degistirilemez demektir
        (override )

         */
    }
}
