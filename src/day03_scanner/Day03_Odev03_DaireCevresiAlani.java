package day03_scanner;

import java.util.Scanner;

public class Day03_Odev03_DaireCevresiAlani {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen Dairenizin Yarıçapını Giriniz:  ");
        double yaricap= scan.nextDouble();
        System.out.println("Yarı Çapını Girdiğiniz Dairenini Çevresi : "+(2*(22/7)*yaricap));
        System.out.println("Yarı Çapını Girdiğiniz Dairenin Alanı    : "+(22/7)*yaricap*yaricap);

    }
}
