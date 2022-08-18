package day35_InheritancedaConstructorKullanimi;

public class LOgretmen {

    LOgretmen (){

        System.out.println("LOgretmen parametresiz cons");
    }
    LOgretmen(String isim){
        //super();// this de ik satirda olmasi gerektigi icin ikisi bir olmaz
        this();
        System.out.println("LOgretmen parametreli cons");
    }


}
