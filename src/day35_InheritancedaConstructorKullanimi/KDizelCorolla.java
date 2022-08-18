package day35_InheritancedaConstructorKullanimi;

public class KDizelCorolla extends HCorolla {
    KDizelCorolla(){

        System.out.println("KDizelCorolla Parametresiz Constructor");
    }

    KDizelCorolla(String isim){
        super(isim);
        System.out.println("KDizelCorolla Parametreli Constructor");
    }

    public static void main(String[] args) {
        KDizelCorolla obj1=new KDizelCorolla("Hasan");

    }
}
