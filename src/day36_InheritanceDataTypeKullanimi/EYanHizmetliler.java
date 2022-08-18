package day36_InheritanceDataTypeKullanimi;

public class EYanHizmetliler extends BMuhasebe  {

    protected int saatUcreti=9;
    protected int gunlukMesai=8;

    protected void maas(){
        System.out.println("Yan Hizmetliler  : "+(30*gunlukMesai*saatUcreti)+" maas alir");
    }
    protected void issizlikSigorta(){
        System.out.println("Yan Hizmetliler %30 indirimli islizlik sigorta yaptirabilirler");
    }

    public static void main(String[] args) {

        /*
        Overriding child class daki bir method un
        parent class daki ayni isimdeki methodu
        etkisiz hale getirerek
        kendisinin spesifik ozelligini ortaya cikarmasidir

        Overriding i nerede dikkate aliyoruz?
        bir obje olusturulurken data turu ve cons. farkli ise.

        eger bir obje olusturulurken data turu ve cons. farkli ise
        objenin ozelliklerini belirlerken 3 konuya dikkat cekmeliyiz

        1- obje consturtor un oldugu class da olusur
        2- objenin ozelliklerini aramaya Data turunun oldugu class dan baslariz
           bu class da aranan ozellik bulunamazsa Parent class a bakilir.
           orada da bulamazsak Cte verir

         3- eger aranan ozellik variable ise buldugumuz ilk degeri yazdiririz
          aranan ozellik method ise
          degeri yazdirmadan once override edilmismi diye kontrol etmemiz gerekir.
          eger override edildiyse en guncel degeri yazdiririz.





         */

        BMuhasebe yh1=new EYanHizmetliler();

        System.out.println(yh1.gunlukMesai);//M 8
        System.out.println(yh1.saatUcreti);//M 10
        yh1.maas();//  YH overriding
        yh1.ozelSigorta();// M
        yh1.sigorta();// P
        System.out.println(yh1.isim);//P
        System.out.println(yh1.soyisim);//P
        System.out.println(yh1.departman);//P


        //System.out.println(yh1.issizlikSigorta);
        // Aramaya muhasebeden basladigimizdan issizlik sigortasi bulamadik CTE verir
        //Bulsa overriding i dusunecekti ama bulamadi.
    }
}
