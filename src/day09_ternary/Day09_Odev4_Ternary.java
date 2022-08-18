package day09_ternary;

import java.util.Scanner;
// pozitifse yazdir negarifse karesini yazdir
public class Day09_Odev4_Ternary {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Sayi gir");
        int input1 = scan.nextInt();


        System.out.println(input1 >= 0 ? "Sayi pozitif" : (input1 * input1));
    }
}