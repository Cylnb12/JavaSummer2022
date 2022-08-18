package day26_constructor;

public class Ogretmen {


    String isim="Isim Belirtilmedi";
    String soyIsim="Soyisim Belirtilmedi";
    String dogumTarihi="Dogum Tarihi";
    String brans="Brans Belirtilmedi";
    String yanBrans="Yan Brans Belirtilmedi";

    public Ogretmen() {
    }

    public Ogretmen(String isim, String soyIsim, String dogumTarihi, String brans, String yanBrans) {
        this.isim = isim;
        this.soyIsim = soyIsim;
        this.dogumTarihi = dogumTarihi;
        this.brans = brans;
        this.yanBrans = yanBrans;
    }

    public Ogretmen(String isim, String soyIsim, String dogumTarihi) {
        this.isim = isim;
        this.soyIsim = soyIsim;
        this.dogumTarihi = dogumTarihi;
    }

    @Override
    public String toString() {
        return
                "\nisim         :" + isim +
                "\nsoyIsim    :" + soyIsim +
                "\ndogumTarihi:" + dogumTarihi +
                "\nbrans      :" + brans +
                "\nyanBrans   :" + yanBrans
                ;
    }
}
