package day19_Scope;

public class C01_InstanceVariables {
    /*
    Class icerisinde her yerden kullanmak istediginiz variableleri
    Class level'da (Classin icinde ama methodlarin disinda)
    genellikle Class level variableler class in basinda olusturulur.(sart degil)

    Class level daki variable lar icin iki scop vardir:
    1- Static varable(Class variable lari da denir)
    2- instance (Static olmayan) variables (obje variable i da denir)
     */

    int instSayi=20;//static olmayip class level da oldugu icin instance variable dir




    public static void main(String[] args) {
        int sayi=10;
       /* System.out.println(instSayi);
       instance variables static olmadigi icin static clube
       uye main methoddan direk kullanamayiz

       instance variablelerin diger adi object variable dir
       dolayisiyla obje olusturursaniz instance variableleri her yerden kullanabilirsiniz.
        */
        C01_InstanceVariables obje1=new C01_InstanceVariables();
        System.out.println("obje 1 degismeden once : "+obje1.instSayi);//20
        obje1.instSayi=30;

        System.out.println(" obje 1 degistikten sonra : "+ obje1.instSayi);//30

        C01_InstanceVariables obje2=new C01_InstanceVariables();
        System.out.println(" obje 2 degismeden once : "+ obje2.instSayi);//30
        obje2.instSayi=25;
        System.out.println(" obje 2 degistikten sonra : "+ obje2.instSayi);//30
        C01_InstanceVariables obje3=new C01_InstanceVariables();
        /*
        her obje olustugunda instance (object) variable larinin ilk atanan degerini alir
         */

    }


    public static void staticMethod(){
        //System.out.println(sayi);
        /*
        bir methodun icerisinde olusturulan variable
        sadece o methodun icinden kullanilabilir
        (local variables)
         */
        /*
        instSayi=30;
        instance methodlara main method disindaki static methodlardan da direk ulasamayiz
        obje ile olusturursak ulasabiliriz
         */
        C01_InstanceVariables obje4=new C01_InstanceVariables();
        System.out.println(obje4.instSayi);
    }


    public void staticOlmayanMethod(){


        /*
        instance variable lar class icerisindeki static
        olmayan variablelardan direk kullanilabilir
         */

    }
}
