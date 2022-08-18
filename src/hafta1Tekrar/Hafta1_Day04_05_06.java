package hafta1Tekrar;

import java.util.Scanner;

public class Hafta1_Day04_05_06 {
    public static void main(String[] args) {
         int a=10;
         byte b=20;
         short c=30;
         double d=40.60;
         
         int islem1=  a/b;
        System.out.println("islem1 = " + islem1);
        
        byte islem2= (byte) (c/b);
        System.out.println("islem2 = " + islem2);
        
        double islem3=(double) a/b;
        System.out.println("islem3 = " + islem3);
        
        byte e= 29;
        int f= e;
        System.out.println("f = " + f);

        int g= 200;
        byte h= (byte) g;
        System.out.println("h = " + h);




        int sayi1=9;
        sayi1++;
        sayi1+=10;
        System.out.println("Eklemeli Deneme : "+ ++sayi1);
        System.out.println(++sayi1+15);


        Scanner scan=new Scanner(System.in);
        System.out.println("4 Basamakli BIr Sayi Giriniz : ");
        int sayi= scan.nextInt();

        int birlerBasamagi=0;
        int rakamlarToplami=0;
        int ilkSayi=sayi;


        birlerBasamagi=sayi%10;
        rakamlarToplami+=birlerBasamagi;
        sayi=sayi/10;


        birlerBasamagi=sayi%10;
        rakamlarToplami+=birlerBasamagi;
        sayi=sayi/10;


        birlerBasamagi=sayi%10;
        rakamlarToplami+=birlerBasamagi;
        sayi=sayi/10;


        birlerBasamagi=sayi%10;
        rakamlarToplami+=birlerBasamagi;
        sayi=sayi/10;

        System.out.println("Girdiginiz   "+ilkSayi+ "   Sayisinin Rakamlar Toplami : "+ rakamlarToplami);


        System.out.println("hayrina bir sayi girele : ");
        int sifre= scan.nextInt();
        System.out.println(""+sifre+ilkSayi);

















    }
}
