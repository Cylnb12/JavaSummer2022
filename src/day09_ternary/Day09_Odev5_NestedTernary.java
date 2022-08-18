package day09_ternary;

import java.util.Scanner;
// Rakam -iki basamakli = uc basamakli
public class Day09_Odev5_NestedTernary {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Sayi gir");
        int input1=scan.nextInt();

        System.out.println(input1<10?"Rakam":
                input1<100?"Iki Basamakli sayi":
                "Uc Basamkli veya daha buyuk sayi");

    }
}
