package day35_InheritancedaConstructorKullanimi;

public class AGrandParent {

    protected String isim="Grandpa ismi belirtilmedi";

    /*
    Her class da gorunmese bile bir constructor vardir
    Bu class dan obje olusturmak istedigimizde
    default constructor devreye girecektir


    Default construvtor u gozlemleyemecegimiz icin onun yerine
    kullanilabilcek parametresiz constructor olusturalim


     */
protected String grandpaKlupAdi="Grandpa Klubu";


    AGrandParent(){

        System.out.println("Grandpa Constractor calisti");
    }



}
