package day07_ifStatements;

import java.util.Locale;
import java.util.Scanner;

public class Day07_Odev7_GunIsmiIlk3buyukDiger2Kucuk {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir gun ismi giriniz");
        String gun=scan.nextLine().toLowerCase();

        if (gun.equals("pazartesi")||gun.equals("sali")||gun.equals("carsamba")
        ||gun.equals("persembe")||gun.equals("cuma")||gun.equals("cumartesi")
        ||gun.equals("pazar")){
            System.out.println( gun.substring(0,2).toUpperCase().concat(gun.substring(3,4).toLowerCase()));
        }



    }
}
