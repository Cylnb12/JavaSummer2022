package day03_scanner;

import java.util.Scanner;

public class Day03_Odev04_PrizmaHacmi {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen Uzun kenar Yüksekliğini Giriniz : ");
        double uk= scan.nextDouble();
        System.out.println("Lütfen Kısa Kenar Yükseklğini Giriniz : ");
        double kk=scan.nextDouble();
        System.out.println("Lütfen Yüksükliği Giriniz : ");
        double yk= scan.nextDouble();
        double prizmaHacmi=(uk*kk*yk);
        System.out.println(prizmaHacmi);


    }
}
