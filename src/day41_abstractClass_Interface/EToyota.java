package day41_abstractClass_Interface;

public abstract class EToyota extends DAraba {


    @Override
    protected void motor() {

        System.out.println("Toyota arabalar cevreci motor kullanir");

    }
    /*
    Parent class daki standart belirleyici methodlar
    (abstract method) larin tamami child class tarafindan
    override edilmelidir

    concrete methodlarin override edilme mecburiyeti yoktur
    istersek override edebiliriz istemezsek etmeyiz

    Aslinda toyota class i da obje uretecegimiz bir class degil
    bu durumda eger proje tasarimi yapiyorsaniz toyota clasini da
    abstract yapmaniz guzel olur


     */
    public static void main(String[] args) {
        //EToyota arb3=new EToyota();
        //Abstract class lar constructor barindirir ama obje uretemezler
        // Toyota class i abstract bir class oldugundan obje uretilemez


    }
}
