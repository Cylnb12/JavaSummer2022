package day18_whileDoWhile;

import java.util.Scanner;

public class C04_DoWhileLoop {
    public static void main(String[] args) {

        /*
        Kullanicidan tam sayilar alin
        kulanici cift sayi girdigi muddetce sayilari yazdirin
        tek sayi girdiginde islemi bitirin

         */
        Scanner scan=new Scanner(System.in);
        int sayi=0;

        // while loop la yapalim
        /*
        loop larda kullanacagimiz variableleri looptan once olusturmaliyiz
        while loop ta loop dan once olusturdugumuz olusturdugumuz bu
        variable ye atayabilecegimiz degeri iyi dusunmemiz gerekiyor

         */

        while (sayi%2==0){

            System.out.println("lutfen bir sayi giriniz");
            sayi= scan.nextInt();
            if (sayi%2==0){
                System.out.println("girilen sayi cift : "+sayi);
            }else{
                System.out.println("Girilrn sayi tek, benden bu kadar");
            }

        }

        // do While ile yapalim
        // do while loop da onceden olusturulan variable ye
        // hangi deger atandiginin bir ehemmiyeti yok
        //kod her durumda calisir

        /*
        Do while nin dez avantaji :
        ilk calistirma kontrol yapilmadan oldugu icin
        loop un body sinde yanlis bir islem yapilmamasina dikkat etmek
        gerekir
         */

        do {
            System.out.println("lutfen bir sayi giriniz");
            sayi= scan.nextInt();
            if (sayi%2==0){
                System.out.println("girilen sayi cift : "+sayi);
            }else{
                System.out.println("Girilrn sayi tek, benden bu kadar");
            }


        }while (sayi%2==0);



    }
}
