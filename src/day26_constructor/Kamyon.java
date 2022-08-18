package day26_constructor;

public class Kamyon {
    public String marka="Marka belirtilmedi";
    public String model="Model belirtilmedi";
    public int yil;
    public int fiyat;

    public Kamyon(String marka, String model) {
        this.marka = marka;
        this.model = model;
    }

    public Kamyon(String marka, String model, int yil, int fiyat) {
        this.marka=marka;
        this.model=model;
        this.yil=yil;
        this.fiyat=fiyat;
        /*
        bizim temel amacimiz Kamyonrunner da argument olarak
        girilen degerin Kamyon class inde instance variable a atanmasi
        Ancak Scope konusunda ogrendogimiz gibi
        Kamyon constructor u scope un da marka oldugu icin
        instance markaya gitmiyor

        bu karisikligi gidermek icin instance variable lari belirli hale gertirmemiz lazim
        Java bunun icin This. kayword u olusturmustur

        Genel kullanim acisindan this keyword u
        kodu herkesin anlamasini kolaylastirdigi icin tercih edilir


         */

    }

    public Kamyon(){


    }
    @Override
    public String toString() {
        return
                "\nmarka=" + marka +
                "\nmodel=" + model +
                "\nyil  =" + yil +
                "\nfiyat=" + fiyat ;
    }
}
