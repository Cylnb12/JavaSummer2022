package day26_constructor;

import day25_constructor.Car;

public class ArabaRunner {
    public static void main(String[] args) {
        //bir gun onceki Car class inden obje olusturabiliriz
        /*
        Farkli bir package daki bir class dan obje olustrurldgunda
        access modifier lari da dikkate almaliyiz
         */
        Car car1=new Car();
        System.out.println( car1.fiyat);

        /*
        Araba class indan bir obje olusturdugumda
        eger default contructor kullanildiysa
        tum ozellikler icin tek tek deger atamak zorunda kaliriz

         */

        Araba araba1=new Araba();
        araba1.fiyat=10000;
        araba1.marka="Mercedes";
        araba1.yil=2010;
        araba1.model="C180";


        Car car2=new Car();
        System.out.println("Marka : "+araba1.marka+"\n"+
                "Model : "+araba1.model+"\nyil : "+ araba1.yil+"\nFiyat : "+ araba1.fiyat);

        System.out.println();
        /*
        eger bir objeyi olustururken bazi ozellukleri argument olarak belirtip
        o ozelliklerde bir obje olustrumak istersek
        Java itiraz eder
        Cunku her Class da default constructor vardir ama o da parametresizdir
        bizim yeni ve parametreli comstructor(lar) a ihtiyacimiz var

         */
        Araba araba2=new Araba("BMW","5.20" , 2011, 15000);

        System.out.println("Marka : "+araba2.marka+"\n"+
                "Model : "+araba2.model+"\nyil : "+ araba2.yil+"\nFiyat : "+ araba2.fiyat);

        Araba araba3=new Araba("Opel","Astra",2015,78000);
        System.out.println();
        System.out.println("Marka : "+araba3.marka+"\n"+
                "Model : "+araba3.model+"\nyil : "+ araba3.yil+"\nFiyat : "+ araba3.fiyat);
        System.out.println();
        Araba araba4=new Araba("Audi","A5",2020,50000);
        System.out.println("Marka : "+araba4.marka+"\n"+
                "Model : "+araba4.model+"\nyil : "+ araba4.yil+"\nFiyat : "+ araba4.yil+"\nFiyat : "+ araba3.fiyat);

    }
}
