package day41_abstractClass_Interface;

public class FMercedes extends DAraba{


    @Override
    protected void yakit() {
        /*
        abstract bir parent in concrete child class
        inherit ederse parent abstract class daki
        tum abstract methodlari override etmek zorundadir.

        abstract bir class, abstract baska bir class i parent edinirse
        parent class daki tum abstract methodlari override etmek zorunda degildir



         */
    }

    @Override
    protected void kaporta() {

    }

    @Override
    protected void motor() {


    }

    public static void main(String[] args) {
        FMercedes arb2=new FMercedes();
    }
}
