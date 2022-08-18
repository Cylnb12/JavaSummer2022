package day43_interfaces_iterators;

public interface I01_InterfaceBodyOlanMethod {

    void motor();
    public void yakit();
    public abstract String aku();

    /*
    normal bir class da oldugumuzu dusunursek
    iki tane access modifier kullanma ihtimali OLAMAZ.

    asagidaki methodda goreceginiz gibi interface de istisnai olarak
    body si olan methodlar olusturulabilir

    Bu ozellik java 8 den sonra kullanilmaya baslanimistir
    bu ozellikten sonra,
    bir interface e yeni bir method eklememiz gerektiginde
    eskiden beri interface i implement eden tum class lara gdip
    yeni eklenen methodu override etmemiz gerekirdi

    bu ozellik sayesinde basina default yada static keyword ekleyereke
    interface te yeni va body si olan bi method olusturursak
    bu meyhodun child classlar tarafindan override edilme mecburiyeti olmaz
    ve eskiden implement edtmis classlari degistirmemiz gerekmez
    Bu istismai bir durumdur ve interface icin olusturulan
    genel kurallari bozmaz..

    Bu methodlarin body si olsa da bunlara cocrete method denmez
    ama override edilme mecburiyetleri yoktur

    buradaki default kelimesi access modifier degil
    istisnai durumun belirtilmesi icindir

    O zaman nicin iki keyword (static ve default) tanimlanmistir?

    Bu iki farkli kelimenin amaci child classlardan
    bu methoda nasil erisilebilecegini belirlemek icindir
    static keywor kullanilirsa, child classlardan bu methoda erismek icin
    IterfaceAdi.methodAdi yeterli olur

    default keyword kullanilirsa , methoda drismek icin obje olusturulmalidir



     */

    public default void teker(){

        System.out.println("default   ...tum arabalarin tekeri vardir");
    }
    public static void direksiyon(){
        System.out.println("Static   ...Tum arabalarin direksiyornu vardir");
    }

    /*
    Parent interface de abstract olan 3 methodu implement ettigimizde
    Java itirazini durdurur.
    sonradan ekledigimiz def veya static keyword ile tanimladigimiz methodlari
    implement etmemiz sorun olusturmadi


     */


}
