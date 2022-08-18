package day41_abstractClass_Interface;

public abstract class KBmw extends DAraba{
/*
araba classindaki bodysi olmayan methodlar ne ise yarıyor
ya kural koy ya kurala uy diyor.
 */

    /*
    Bmw abstract bir class in abstract bir childi
    oldugu icin parent class daki abstract methodlari
    implement etmek ZORUNDA KALMADI
     */

    public abstract void amblem();
    public abstract void guvenlik();



}
