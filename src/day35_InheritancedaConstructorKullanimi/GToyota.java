package day35_InheritancedaConstructorKullanimi;

public class GToyota {
    GToyota(){

        System.out.println("GToyota Parametresiz Constructor");
    }

    GToyota(String isim){
        //super(isim); extends olmadigi icin super constructor call u java kabul etmez

        System.out.println("GToyota Parametreli Constructor");
    }



}
