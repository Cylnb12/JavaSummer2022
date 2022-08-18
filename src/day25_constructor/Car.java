package day25_constructor;

public class Car {
    /*
    bu class bizim kaliphanemiz
    bir araba olusturmak icin olusturulan variable ve methodlari
    bu class da belirleriz

    sonra farkli class larda araba olusturmamiz gerekirse
    bu class da bir obje olusturulup burada belirlenen variable ve
     methodlara gore araba uretiriz
     */
    public String marka="Marka belirtilmedi";
    public String model="Model belirtilmedi";
    public int yil;
    public int fiyat;


    public void benzinliArac(){
        System.out.println("Bu arac benzinli motora sahiptir");

    }
    public void maxHiz(int hiz){
        System.out.println("Bu araba Max "+hiz+" km hiz yapar");
    }
}
