package day35_InheritancedaConstructorKullanimi;

public class Child extends BParent {


    protected String isim="Child isim belirtilmedi";
    protected String childKlupAdi="Child Klubu";
    Child(){
        System.out.println("Child constructor calisti");
    }

    public static void main(String[] args) {

        AGrandParent gp1=new AGrandParent();
        // Bu objeyi olusturmak icin Grandpa constructor calisir
        //Parent ve child constructor calisir mi
        Child child1=new Child();
        child1.grandpaKlupAdi="Child";
        child1.parentKlupAdi="Child2";



        //child1 objesi icin Child constructor calisir
        /*
        Javada bir class i kulanabilmek icin
        o class dan obje olusturur dolaysiyla
        o class in constructor unu kullanirdik

        Java inheritance da parent class lardaki
        ozellikleri kullanabilmek icin
        o class larin constructor larini otomatik calistiran bir
        yapi kurmustur

        orn; biz child class inda kendi classimizda
        Child class indan bir obje olusturmak istedigimizde Child
        constructor unu kullaniriz


        Java Child constructorunu gordugunde
        once parent in constructor unu calistirmam lazim der
        buradan parent constructor a gider
        Parent class inda Parent constructor ini gorunce
        once bunun paretn inin yani Grandparent constructor
        calismasi gerekir der

        Boylece extends keywords olmayan class a kadar gider ve oradan baslayarak
        tum constructorlari asagi dogru calistirir

         */



    }
}
