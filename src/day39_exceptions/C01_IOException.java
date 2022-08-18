package day39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C01_IOException {

    public static void main(String[] args) throws FileNotFoundException {
        /*
        Java'da bilgisayarimizdaki bir dosyaya erismek istiyorsak
        FileInputStreamclass indan yardim aliriz
        Ayni sekilde Javadan bilgisayarimizdaki bir dosyaya ekleme yada
        update yapmak istersek FIleOutputStream Class indan yardim aliriz
         */

        FileInputStream fis=new FileInputStream("src/day39_exceptions/Test.txt");
/*
Goruldugu gibi CompleTime da altini kirmizi cizen her durum
Compile Time Error degildir.
Java'da bazi exceptions lar compile time excption dur.
Ozellikle dosya yazma ile ilgili exceptionlar Complie Time Exception dir

Compile time exception da java cozum icin iki ihtimal onerir
1- try-catch ile cevrelemek
2-method signiture'ina throws keywords ile beklenen exception turunu yazmak;

throws Exception , sadece bilgi olayin farkinda oldugumuzun deklerasyonudur
exceptionun handle edilmesinde hicbir rolu yoktur.
 Yani try-catch ile kontrol altina aldigimiz exceptionlarda
 kod calismaya devam ediyordu
 Ancak throws exceptions yazdigimizda java bir exception ile karsilasirsa
 yine hicbirsey yapmamisiz gibi hata mesaji yayinlayip calismayi durdurur


 */
    }

}
