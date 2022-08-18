package day42_abstractClass_Interface;

import java.util.ArrayList;
import java.util.List;

public interface I02_Interfaces {
    int SAYI=20;
    String ISIM="Yildiz Koleji";
    /*
    Interface bir class degildir
    Abstract Class lar javada abstraction (soyutlastirma/Kural Koyma)
    islevini yapiyordu
    Ancak, abstract bir class da abstract olmayan methodlar da olabilir
    bu da full abstraction yapmaya izin vermez
    eger javada icinde hic concrete method olmasin dedigimiz bir class olusturmak istiyorsaniz
    bunu class degil interface yapmialisiniz

    1-INTERFACE lerde CONCRETE METHOD OLMAZZZZ.

    2-Interface ler full abstractin yaptigindan interfacelerden obje OLUSTURULAMAZ

    Hatirladiginiz gibi interface olan list den direk obje olusturamiyorduk
    List<String> liste=new List<>();
    bunun yerine constractor u list in child i olan
    arrayList ten  seceriz
    List<String> liste=new ArrayList<>();

    3-Class larda bir child birden fazla parent edinemez
    Ancak interface lerde cncrete method olmadigindan
    biz her methodu chil class da override etmek zorundayiz
    Override ederken kimin soyledigini override ettigimizin onemi yok

    4-Interface ler neyin yaplmasi gerektigini soyler
    ama nasil yapilacagina karismaz




     */



}
