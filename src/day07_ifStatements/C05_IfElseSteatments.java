package day07_ifStatements;

import java.util.Scanner;

public class C05_IfElseSteatments {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen Bir Karakter Giriniz : ");
        char harf=scan.next().charAt(0);

        if ((harf>='a' && harf<='z') || (harf>='A'&& harf<='Z')){
            System.out.println("Girilen karakter Bir Harf");
        }else {
            System.out.println("Girilen karakter Bir Harf Degil");
        }



    }
}
