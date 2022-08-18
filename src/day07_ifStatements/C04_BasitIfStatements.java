package day07_ifStatements;

import java.util.Scanner;

public class C04_BasitIfStatements {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen BIr GUn Ismi Giriniz : ");
        String girilenGun=scan.next().toLowerCase();

        if (girilenGun.equals("pazar") || girilenGun.equals("cumartesi")){
            System.out.println("Girilen GUn HAFTASONU");
        }
        if (girilenGun.equals("pazartesi") || girilenGun.equals("sali")
                || girilenGun.equals("carsamba") || girilenGun.equals("persembe")
                || girilenGun.equals("cuma")){
        System.out.println("girilen gun HAFTAICI");
        }

        if (!(girilenGun.equals("pazar") || girilenGun.equals("cumartesi")||(girilenGun.equals("Paratesi") || girilenGun.equals("sali") || girilenGun.equals("carsamba")
                || girilenGun.equals("Persembe")|| girilenGun.equals("cuma")))) {
            System.out.println("Lutfen gecerli bir gun giriniz ");
        }

    }
}
