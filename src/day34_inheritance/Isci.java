package day34_inheritance;

public class Isci extends Personel {
/*
Normal hayatimizda parent cocuk sahibi olmaya karar verebilir

Javada ise child class lar ozelliklerini inherit etmek istedikleri class i kendilerine
parent edinirler

mesela isci classini olusturunca nelere ihtiyaci var diye dusunsek
personel class indaki tum variable ve methodlara
ihtiyaci oldugunu gorebiliriz

bu durumda o variable ve methodlari olusturmak yerine
Personel class ini kendimize parent ediniriz

bi class baska bir class i parent edindiginde
1- parent class daki tum ozelliklere (variable+method) otomatik olarak sahip olur
2- parent class daki ozelliklerden bazilarini kendine uyarlayabilir
3- parent class da olmayan bazi yeni ozellikler(variable+method) olusturabilir

not: parent class daki ozelliklerden hicbirini reddedemez ama degistirebilir
 */
    int persNo=1001;
public static void main(String[] args) {


    Isci isci1=new Isci();
    System.out.println(isci1.isim);//isim belirtilmedi
    isci1.isim="Selim";
    System.out.println(isci1.persNo);//1001// kendi classida olan icin parent a gitmez

    isci1.maas();//Isciler minimum 15 euro saat ucreti alir





}
public void maas(){

    System.out.println("Isciler minimum 15 euro saat ucreti alir");

}
public void ozelSigorta(){
    System.out.println("Iscilerden isteyene %50 indirimli ozel sigorta yaptirilir");
}
}
