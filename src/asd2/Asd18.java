package asd2;

import java.util.Scanner;

public class Asd18 {
    public static void main(String[] args) {
        //Kullanıcıdan bir isim girmesini isteyin ve son 2 harfinin 3 kopyasından oluşan yeni bir String yazdırın
        //
        //Kullanicidan alinan isim uzunluğu en az 2 olacaktır.
        //
        //INPUT : Mustafa
        //
        //OUTPUT : fafafa

        Scanner scan=new Scanner(System.in);
        String isim=scan.nextLine();
        if (isim.length()>2){
            System.out.println(isim.substring(isim.length()-2,isim.length())+
                                isim.substring(isim.length()-2,isim.length())+
                                 isim.substring(isim.length()-2,isim.length()));
        }
    }
}
