package asd3;

import java.util.Scanner;

public class Asd19_ArtikYil {
    public static void main(String[] args) {


        int artikYil = yirmiDokuzlu();


        int baba = yirmiDokuzlu();
    }

    public static int yirmiDokuzlu() {

        System.out.println("Lutfen bir yil giriniz");
        Scanner scan = new Scanner(System.in);
        int yil = scan.nextInt();

        if (yil % 4 != 0) {
            System.out.println("Artik yil degil");
        } else if (yil % 100 != 0) {
            System.out.println("Artik yil");
        } else if (yil % 400 != 0) {
            System.out.println("Artik yil degil");

        } else {
            System.out.println("Artik yil");
        }

        return yil;
    }
}
