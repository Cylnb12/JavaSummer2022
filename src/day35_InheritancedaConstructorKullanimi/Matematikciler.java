package day35_InheritancedaConstructorKullanimi;

public class Matematikciler extends LOgretmen {

Matematikciler (){

    System.out.println("Matematik parametresiz cons");
}
Matematikciler(String isim){
    this();
    System.out.println("Matemetik parametreli cons");
}

    public static void main(String[] args) {
    Matematikciler obj1=new Matematikciler("Tugba");

    }
    /*

    this() consttructor call icinde bulunulan class daki onstructorlari
    super() ise paretn constructorlari cagirir

    this() veya super() parametre yapisina uygun bir constructo bulamazsa
    yoksa cte verir

    constructor konusunda gordugumuz this.
    o class daki instance variable lari refere ediyordu

    inheritance da da super. vardir
    super. paretn class daki instance lari refere eder

     */
}
