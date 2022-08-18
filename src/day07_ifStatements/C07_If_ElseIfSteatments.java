package day07_ifStatements;

import java.util.Scanner;

public class C07_If_ElseIfSteatments {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen Yasinizi Giriniz : ");
        int yas=scan.nextInt();

        if (yas<0) {
            System.out.println("Lutfen gecerli bir yas giriniz : ");
        }else if (yas<65){
            System.out.println("Emekli olamazsin  \"+(65-yas)+\" yil daha Calismalisin");

        }else {
            System.out.println("Emekli olabilirsin");
        }

    }
}
