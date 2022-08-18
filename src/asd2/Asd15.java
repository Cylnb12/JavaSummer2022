package asd2;

import java.util.Scanner;

public class Asd15 {
    public static void main(String[] args) {
        //Bir aydaki gün sayısını hesaplayan bir Java programı yazınız.
        //
        //INPUT:
        //
        //Ay Numarasi:
        //
        //2
        //
        //Yil :
        //
        //2016
        //
        //OUTPUT :
        //
        //Subat 2016 29 Gundur.

        Scanner scan = new Scanner(System.in);


        int yil = scan.nextInt();
        int ay = scan.nextInt();
        String sonuc = "";

        if (yil % 4 != 0) {
            sonuc = "Artik yil degil";
        } else if (yil % 100 != 0) {
            sonuc = "Artik yil";
        } else if (yil % 400 == 0) {
            sonuc = "Artik yil";
        } else {
            sonuc = "Artik yil degil";
        }

        if (sonuc == "Artik yil degil") {
            switch (ay) {
                case 1:System.out.println("ocak");break;
                case 2:System.out.println("subat");break;
                case 3:System.out.println("mart");break;
                case 4:System.out.println("nisan");break;
                case 5:System.out.println("mayis");break;
                case 6:System.out.println("haziran");break;
                case 7:System.out.println("temmuz");break;
                case 8:System.out.println("agustos");break;
                case 9:System.out.println("eylul");break;
                case 10:System.out.println("ekim");break;
                case 11:System.out.println("kasim");break;
                case 12:System.out.println("aralik");break;
            }
            switch (ay) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 10:
                case 12: System.out.println(yil+ay+"\n31 gundur");break;
                case 2:
                case 4:
                case 6:
                case 8:
                case 9:
                case 11: System.out.println(yil+ay+"\n30 gundur");break;

            }
        } else if (sonuc == "Artik yil")  {
            switch (ay) {
                case 1:System.out.println("ocak");break;
                case 2:System.out.println("subat");break;
                case 3:System.out.println("mart");break;
                case 4:System.out.println("nisan");break;
                case 5:System.out.println("mayis");break;
                case 6:System.out.println("haziran");break;
                case 7:System.out.println("temmuz");break;
                case 8:System.out.println("agustos");break;
                case 9:System.out.println("eylul");break;
                case 10:System.out.println("ekim");break;
                case 11:System.out.println("kasim");break;
                case 12:System.out.println("aralik");break;
            }
            switch (ay) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 10:
                case 12: System.out.println(yil+"\n31 gundur");break;
                case 2: System.out.println(yil+"\n29 gundur");break;
                case 4:
                case 6:
                case 8:
                case 9:
                case 11: System.out.println(yil+"\n30 gundur");break;

            }
        }
    }
}