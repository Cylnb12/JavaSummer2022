package day33_encapsulation;

public class ArabaRunner {
    public static void main(String[] args) {
        Araba arb1=new Araba();
        //arb1 objesi uzerinden marka variable ina ulasabildim,
        //degistirebildim(set) ve yazdirabildim(get)
        arb1.marka="Toyota";
        System.out.println(arb1.marka);

        //access modifier kullanarak marka variable ina ulasimi
        //tamamen serbest yapabilir veya tamamen engelleyebilirim

        // private yaptigimiz modele ise hic ulasamayiz

        //yani access modifier ya hep ya hic diyor

        //marka'yi degistirelim ama goremeyelim
        // yakiti da gorelim ama degistiremeyelim


        //set ve get yetkilerini ozel oarak tanimlamak isterseniz
        //1. adim ozel yetki tanimlayacaginiz variable lari private yapin
        //           private bir dataya baska classlardan ulasmak mumkun olmadigindan
        //2.adim set yetkisi icin setter,ve get yetkisi icin getter method lari olusturalim

        arb1.setModel("Corolla");//model olarak corollayi atadik
        //modeli yazdirma imkanimiz yok cunku getter methodu yok
        System.out.println(arb1.getYakit());//yakit olarak elektrikli bilgisini yazdirabildik
        //yakiti degistiremeyiz cunku setter methodu yok




    }
}
