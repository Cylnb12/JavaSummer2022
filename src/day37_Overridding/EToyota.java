package day37_Overridding;

public abstract class EToyota extends DAraba {



    void marka(){
        System.out.println("Markamiz Toyota");
        /*super.marka();

        Eger hem overridding hem overridden methodlarin calismasini istersek
        ilgili satira super.marka() yazabiliriz

         */
    }



    void motor(){
        System.out.println("Toyota araclar cevreci motor kullanir");
    }
}
