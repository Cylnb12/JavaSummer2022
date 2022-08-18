package asd2;

import java.util.Scanner;

public class Asd13 {
    public static void main(String[] args) {
       //Girilen zamanı saniyeye çeviren bir program yazınız.
        //
        //Örnek Çıktı:
        //
        //1 saat 10 dakika 50 saniye ==>
        //
        //4250 saniye
        Scanner scan=new Scanner(System.in);

        int saat= scan.nextInt();

        int dakika= scan.nextInt();

        int saniye= scan.nextInt();

        System.out.println(saat*3600+dakika*60+saniye+" saniye");







    }
}
