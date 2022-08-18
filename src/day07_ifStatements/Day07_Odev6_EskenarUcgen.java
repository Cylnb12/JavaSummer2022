package day07_ifStatements;

import java.util.Scanner;

public class Day07_Odev6_EskenarUcgen {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen Ucgeninizin Uc Kenarini Yaziniz \n 1.Kenar");
        double kenar1= scan.nextDouble();

        System.out.println("2.kenar");
        double kenar2= scan.nextDouble();

        System.out.println("3.kenar");
        double kenar3= scan.nextDouble();

        if (kenar1==kenar2&&kenar3==kenar1){
            System.out.println("Uc kenarini yazdiginiz ucgeniniz ESKENAR UCGEN");


        }else {
            System.out.println("Uc kenarini yazdiginiz ucgeniniz ESKENAR UCGEN DEGIL!!");}

    }
}
