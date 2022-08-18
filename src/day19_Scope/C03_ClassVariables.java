package day19_Scope;

public class C03_ClassVariables {
    public static void main(String[] args) {

        /*
        Farkli bir classda calisirken herhangi bir class adini yazip
        . noktaya basarsak adini yazdigimiz classdaki tum static class uyelerini gorebilir
        ve kullanabiliriz
         */
        C02_StaticVariables.staticMethod();//10
        System.out.println(C02_StaticVariables.staticSayi);//10
        System.out.println(C02_StaticVariables.degersizStaticVar);//0
/*
class level variable lara deger atayip atamamak bize kalmistir
istersek deger atariz istersek deger atamayiz
Eger deger atamissak java atadigimiz o degeri kabul eder
deger atamazsak o zaman java bu varoiable lara defoult bir deger atamasi yapar
int--> 0
String--> null
boolean--> false
char--> '' (hiclik)
 */

        /*
        baska classdaki Instance variablelara obje olusturarak olusturabiliriz
         */
        C02_StaticVariables obje1=new C02_StaticVariables();
        obje1.staticOlmayanMethod();//10
        //bu method icinde static sayi=20 oldu
        System.out.println(obje1.isim);//mehmet
        System.out.println(obje1.degersizInstanceVariable);//0
        System.out.println(C02_StaticVariables.staticSayi);//20
        /*
        Farkli bir classdan method ve variable lari kullanildiginda
        o classin tamami degil sadece cagirdigim yer calisir
         */

    }
}
