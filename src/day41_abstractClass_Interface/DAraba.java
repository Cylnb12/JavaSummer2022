package day41_abstractClass_Interface;

public abstract class DAraba {
    public static void main(String[] args) {
        /*abstract class da main method opsiyoneldir
        Eger abstract class sadece child classlarin
        tasimak zorunda oldugu ozellikleri belirlemek icin olusturulduysa
        main method a ihtiyac olmaz
        sadece abstract methodlar olur

        ama bir abstract method da
         standart belirlemek disinda da methodlar calisabilir
         bu durumda ihtiyac olursa main  method olusturuabilir

         */
    }
    protected abstract void yakit();
    protected abstract void kaporta();


    protected abstract void motor();
    /*
    sadece child class larin mecburi tasiyacaklari
    ozellikleri belirleyen methodlar abstract method olur
    ve abstract methodlarin body si olmaz
     */
    public void klima(){
        System.out.println("bazi arabalarda klima olabilir");

        /*
        abstract olmayan methodlara concrete(somut) method denir.
        abstract bir methodu abstract keyword ile belirtmek zorunludur
        ancak ancak abstract olmayan methodlara concrete methodlarda
        bunun declare edilmesine gereke yoktur
        biz sadece abstraction ile ilgili konustugumuzde abstract olmayan
        methodlardan bahsetmek icin concrete tabirini kullaniriz
         */


    }



}
