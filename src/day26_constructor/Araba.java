package day26_constructor;

public class Araba {


    public String marka="Marka belirtilmedi";
    public String model="Model belirtilmedi";
    public int yil;
    public int fiyat;

    public Araba(String markaR, String modelR, int yilR, int fiyatR) {
        marka=markaR;
        model=modelR;
        yil=yilR;
        fiyat=fiyatR;
    }
    /*
    biz herhangi bir constructor
      olusturdugunuzda java default constructoru siler
      eger biz projemizde bir sorun yasanmasini istemiyorsak
      mutlaka default constructor yerine parametresiz bir constructor
      olusturmaliyiz

      */

    public Araba(){

    }

    public void benzinliArac(){
        System.out.println("Bu arac benzinli motora sahiptir");

    }
    public void maxHiz(int hiz){
        System.out.println("Bu araba Max "+hiz+" km hiz yapar");
    }


}
