package day35_InheritancedaConstructorKullanimi;

public class FMemur extends EMuhasebe {
    /*
    Extends kayword kullanilan classlarda
    ister default constructor bulunsun
    istersek de biz yeni constructor(lar)
    olusturaim
    Java constructor in ilk satirina
    super(); constructor call yazar

    super(); constructor call default constructor a benzer
    gorulmese de orada vardir ve calisir

   ancak biz ilk satira farkli bir constructor call yazarsak
   java super() constractor unu siler


Eger biz mudahale edip kendi constructor call umuzu olusturmazsak
javanin default olarak olusturdugu constructor call her zaman parametresizdir
super();


     */
    FMemur(){

        System.out.println("Memur parametresiz constructor");
    }
    FMemur(String isim){
        System.out.println("Memur parametreli constructor");
    }

    public static void main(String[] args) {

        FMemur memur1=new FMemur("Ali");




    }
}
