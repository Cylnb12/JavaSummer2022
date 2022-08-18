package day07_ifStatements;

import java.util.Scanner;

public class Day07_Odev2_BasHarfIleGunIsmi {
    public static void main(String[] args) {
        System.out.println("Haftanin Gunlerinden birinin Bas harfini Yaziniz : ");
        Scanner scan=new Scanner(System.in);

        char ilkHarf=scan.next().toUpperCase().charAt(0);

        if (ilkHarf=='P'){
            System.out.println("Pazartesi , Persembe , Pazar");

        }else if (ilkHarf=='S'){
            System.out.println("Sali");

        } else if (ilkHarf=='C') {
            System.out.println("Carsamba , cuma , cumartesi");

        }else {
            System.out.println("Lutfen Haftanin Gunlerinden \nBirinin Bas harfini Giriniz");
        }
    }
}
