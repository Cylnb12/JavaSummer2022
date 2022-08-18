package day42_abstractClass_Interface;

public interface I03_Interfaces {
    int SAYI=30;
    /*

    int sayi;  // olmaz

    interface lerde tum variable lar public static ve final dir
    dolayisiyla sonradan deger atama sansimiz yoktur
    bunun icin variable olusturdugumuzdda deger atamak zorundayiz...

    Bir interface bir class i parent edinemez

     */
    void yakit();
    /*
    interface icerisindeki her method
    public ve abstract  ozelliklere sahiptir

    abstract bir methodun body si olmasi mumkun degildir
    Java sonradan developer larin istegi uxerine
    kismi bir update yapmistir

    bir interface e sonradan bir abstract mehod eklerseniz
    o interface i daha once implement etmis tum class laraa gidip
    hepsinde yeni ekelen methodu override etmeniz gerekir
    bu da eskiden beri gelen projeler icin cok zor bir islemdir

    bunun icin java 8 den itibaren
    interface lere sonradan body si olan method ekelnmesine izin vermistir

    Bu methodarin body si olsa da interface nin yapisi geregi
    Bu methodlara concrete denmez...
    Bu body si olan bu methodlar istisna olarak kabul edilebilir

     */
    public void motor ();
    public abstract void teker ();


}
