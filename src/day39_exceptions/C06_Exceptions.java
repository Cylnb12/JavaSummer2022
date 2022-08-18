package day39_exceptions;

import java.util.Scanner;

public class C06_Exceptions {
    public static void main(String[] args) {

/*
Kullanicidan carpma yapmak icin bir string isteyin
kullanicinin girdigi String sadece sayilardan olusuyorsa
sayiyi 2 ile carpıp sonucu yazdirin
Kullanici sayilardan olusmayan bir String girerse
"Girdiginiz String sayiya cevrilemez" yazdirin
 */

        Scanner scan=new Scanner(System.in);

        try {
            String str=scan.nextLine();
            int sayi=Integer.parseInt(str);
            System.out.println(sayi*2);
        } catch (NumberFormatException e) {
            System.err.println("!!!Your Input Can NOT Be Turn Into A Number!!!");
        }

    }
}
