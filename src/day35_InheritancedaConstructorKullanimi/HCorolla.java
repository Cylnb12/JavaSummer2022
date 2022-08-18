package day35_InheritancedaConstructorKullanimi;

public class HCorolla extends GToyota {
    HCorolla(){

        System.out.println("HCorolla Parametresiz Constructor");
    }
    HCorolla(String isim){

        super(isim);
        System.out.println("HCorolla Parametreli Constructor");
    }

}
