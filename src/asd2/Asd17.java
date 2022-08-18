package asd2;

import java.util.Scanner;

public class Asd17 {
    public static void main(String[] args) {


        //// isim1 çift sayıda karakter içeriyorsa,
        //
        //    // ikinci kelimeyi ilk adın ortasına yerleştirin
        //
        //    // ilk kelime tek sayida karakter iceriyorsa
        //
        //    // “isim1, isim2 ye eklenemiyor” yazdırın
        //
        //    // Örneğin:
        //    // isim1= mehmet
        //    // isim2= ahmet
        //    // Yazdır ==> mehahmetmet
        //
        //    // isim1= memet
        //    // isim2= ahmet
        //    // Yazdır ==> isim1, isim2 ye eklenemiyor

        Scanner scan=new Scanner(System.in);
        String isim=scan.next();
        String isim2=scan.next();
        int orta=isim.indexOf(isim.length()/2);
        if (isim.length()%2==0){
            System.out.println(isim.substring(0,isim.length()/2)+isim2+isim.substring(isim.length()/2,isim.length()));

        }else {
            System.out.println("isim1 isim2 ye eklenmiyor");
        }
    }
}
