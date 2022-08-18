package day07_ifStatements;

import java.util.Scanner;

public class Day07_Odev4_DikdortgenKareMi {
    public static void main(String[] args) {
        System.out.println("Lutfen kenar uzunluklarini giriniz : \n 1.kenar : ");
        Scanner scan = new Scanner(System.in);

        int kenar1 = scan.nextInt();

        System.out.println("2.Kenar : ");
        int kenar2 = scan.nextInt();

        System.out.println("3.Kenar");
        int kenar3 = scan.nextInt();

        System.out.println("4.Kenar");
        int kenar4 = scan.nextInt();

        if (kenar1 == kenar2 && kenar3 == kenar4 && kenar2 == kenar3) {
            System.out.println("Sekliniz Karedir ");
        }else {
            System.out.println("Sekliniz Kare Degildir");
        }

    }
}
