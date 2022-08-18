package day38_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C04_Exceptions {
    public static void main(String[] args) {


        String urunler[] = {"nutella", "cokokrem", "sut", "Cay", "Findik"};
        Scanner scan = new Scanner(System.in);

        int siraNo = 0;


        int istenenSira = 0;
        while (true) {
            try {
                System.out.println("Istediginiz urunun sira nosunu giriniz");
                istenenSira = scan.nextInt();
                System.out.println("Aradiginiz urun : " + urunler[istenenSira - 1]);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Urun index'i icin bir tam sayi girmeniz gerekli");
                scan.next();
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Girdiginiz sira listemizde bulunmuyor \nSira numarasi en fazla : " + (urunler.length) + " olabilir");
                scan.nextLine();
            }




        }

    }
}
