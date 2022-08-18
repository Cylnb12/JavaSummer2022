package asd3;

import java.util.Scanner;

public class Asd26_TersYazdirMethod {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir string giriniz");
        String input=scan.nextLine();
        terstenMethod(input);

    }

    public static void terstenMethod(String input) {
        String sonYazi="";

        for (int i = input.length()-1; i >=0 ; i--) {
            sonYazi=sonYazi+input.charAt(i);

        }
        System.out.println(sonYazi);
    }
}
