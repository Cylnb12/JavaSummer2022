package day03_scanner;

import java.util.Scanner;

public class Day03_Odev02_KareninCevresiAlan {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen Bir Kenar Uzunluğunu Giriniz: ");
        int kenar1= scan.nextInt();
        System.out.println("Karenizin Çevresi: "+(4*kenar1)+"\n" +"Karenizin Alanı: "+(kenar1*kenar1));



    }

}
