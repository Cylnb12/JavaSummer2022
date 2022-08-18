package day18_whileDoWhile;

import java.util.Scanner;

public class C06_DoWhileLoop {
    public static void main(String[] args) {

        /*

         */

        Scanner scan=new Scanner(System.in);
        int sayi=0;
        int pozitifSayiAdedi=0;
        int negSayiAdedi=0;
        int pozitifSayilarTop=0;

        do {
            System.out.println("lutfen toplamak uzere pozitif tam sayi giriniz");
            sayi= scan.nextInt();
            if (sayi>0){
                pozitifSayilarTop+=sayi;
                pozitifSayiAdedi++;
            } else if (sayi<0) {
                negSayiAdedi++;
                System.out.println("negatif sayi giremezsiz");

            }

        }while (sayi!=0);
        System.out.println(pozitifSayiAdedi+" adet pozitif sayi girdiniz, toplamlari : "+pozitifSayilarTop);
        System.out.println(negSayiAdedi+"adet negatif sayi girdiniz ancak onlar ilseme alinmadi");

    }
}
