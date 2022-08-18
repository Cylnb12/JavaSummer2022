package day19_Scope;

public class C02_StaticVariables {

    static int staticSayi=10;
    String isim="Mehmet";

    static int degersizStaticVar;
    int degersizInstanceVariable;
    /*
    Class level daki variable lara deger atamasak da java kabul ediyor
     */
    public static void main(String[] args) {
        /*
        eger bir variable static olusturulduysa
        objeler icin degil Class icin gecerlidir
         */

        System.out.println(staticSayi);//10
        staticMethod();//burda kod ilgili methoda gider orasi icin
        // gerekeni yapar sonra tekrar buran akmaya devam eder
        staticSayi=12;
        System.out.println(staticSayi);//12
        C02_StaticVariables obje1=new C02_StaticVariables();// staticolmayani giremedigimiz icin boyle yaptik
        obje1.staticOlmayanMethod();
        /*
        instance variablenin degerini bulmak icin
         objenin olustruldugu satira kadar kodu takip etmeliyiz

         static variable da ise class in basindan baslayarak istenen satira kadar kodu takip edip
         static variable in son degerini bulmamiz lazim
         */
    }

    public static void staticMethod(){

        System.out.println(staticSayi);//10


    }
    public void staticOlmayanMethod(){
        /*
        static variable lar class icerisinden her yerden ulasilanilir
        static olsun veya olmasin tum methodlar static variableyi gorebilir ve degistirebilir
         farki methodlarda static variable nin hangi degeri alacagini bilmek istiyorsak
         clasin basindan itibaren kodun calismasini takip etmeliyiz
         method ne zaman cagirilirsa o anki static variable degerini methodda kullanabiliriz

         */
        System.out.println(staticSayi);//12
        staticSayi=20;

    }
}
