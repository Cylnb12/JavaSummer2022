package day25_constructor;

public class C03 {
    /*
    Proje olustururken bazi Class lar run etmek icin degil
    variable ve method olusturup
    bunlari baska Classlardan kullanmak icin olusturulur

     */
    /*
    Defoult contructor, parametresizdir
    goremesek bile ihtiyac oldugunda calisir

    Class icerisinde parametreli veya parametresiz
     herhangi bir constructor
    olusturursak java defoult constructor u siler

     */
    C03(){

    }

    /*
    olusturdugumuz parametresiz bu constructor
    Defoult constructor ile birebir aynidir

    ama biz olusturdugumuz icin buna Defoult constructor
    demeyiz parametresiz constructor deriz

     */
    String isim="Etka";
    public void method01(){
        System.out.println("C03 method calisti");

    }





}
