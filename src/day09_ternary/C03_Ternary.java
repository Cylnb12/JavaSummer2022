package day09_ternary;

import java.util.Scanner;

public class C03_Ternary {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi= scan.nextInt();

       if (sayi>0){
           System.out.println(sayi);
       }else{System.out.println("lutfen bir sayi giriniz");
           int sayi2= scan.nextInt();
           System.out.println(sayi*sayi2);

      /*
      Eger if else icerisinde yeni kodlar varsa
       ternary ile yapmamiz mumkun olmaz
       */

       }
    }
}
