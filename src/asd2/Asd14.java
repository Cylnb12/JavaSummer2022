package asd2;

import java.util.Scanner;

public class Asd14 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
         System.out.println("Lutfen bir isim giriniz");
         String isim =scan.nextLine();
         if (isim.contains("a")&&isim.contains("Z")){
             System.out.println("Girdiginiz isim hem a harfı hemde Z harfi iceriyor");
         } else if (isim.contains("a")) {
             System.out.println("Girdiginiz isim a harfi iceriyor");
         } else if (isim.contains("Z")) {
             System.out.println("Girdiginiz isim Z harfi iceriyor");
         }else {
             System.out.println("Girdiginiz isim ne a harfi nede Z harfi icermiyor");
         }
    }
}
