package day27_staticKeyWord;

public class C01 {


    static int sayi=10;
    int rakam=5;


    public static void main(String[] args) {

        /*
        class level da iki tur variable vardir
        static variable(Class)   variable
        instance (obje ) variable

        static variable lar tum class dan kullanilabilirken
         instance olanlar static olmayandan kullanilabilr
         instance variabe lara static method dan ulasmak istersek
         obje olusturmamiz gerekir

         instance variable lar obje variable i oldugu icin
         herhangi bir satirda instance variable in degerinin ne oldugunu bulmak icin
         obje olusturulan satirdan itibaren kod incelenmelidir

         static variable lar class variable i oldugu icin
         herhangi bir satirda static variable in  degerini bulmak icin
         CLASS in BASINDAN itibaren kod incelenmelidir
         */
        C01 obj1=new C01();
        System.out.println("obj1 in rakam degeri : "+obj1.rakam);//5
        System.out.println("obj1 in sayi degeri  : "+sayi);//10


        obj1.rakam+=1;
        sayi+=1;

        System.out.println("1 artirdiktan sonra obj1 in rakam degeri : "+obj1.rakam);//6
        System.out.println("1 artirdiktan sonra obj1 in sayi degeri  : "+sayi);//11


        C01 obj2=new C01();
        System.out.println("obj2 in rakam degeri : "+obj1.rakam);//5
        System.out.println("obj2 in sayi degeri  : "+sayi);//11

        obj2.rakam++;//5+1=6
        sayi++;//

        System.out.println("1 artirdiktan sonra obj2 in rakam degeri : "+obj2.rakam);//6
        System.out.println("1 artirdiktan sonra obj2 in sayi degeri  : "+sayi);//12


    }
}
