package day37_Overridding;

public class FSupra extends EToyota {

    protected void yakit(){
        System.out.println("Supra benzin kullanir" );
        /*
        Private methodlar override edilemez
        Eger child class da parent classdaki private method ile
        ayni signiture da bir method olusturursaniz
        bu overridding method olmaz
         */
    }


    @Override
    void motor() {
        System.out.println("Sırali 6 silindir 2JZ kullanır hocam");
    }

    /*
    @Override notasyonu java ya bir gorev verir
    Java bu notasyonla birbirine bagli olan iki methodu
    surekli kontrol eder
    Eger parent class daki overridden methodu silerseniz

    @Override ==> CTE verir.

    @Override  notastonu kullanmak mecburi degildir
    Eger overridden method silinirse kodun CTE vermesini istersek
    override notasyonu kullanmaliyiz



     */
}
