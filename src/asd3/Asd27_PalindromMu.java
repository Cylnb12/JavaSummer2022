package asd3;

import java.util.Scanner;

public class Asd27_PalindromMu {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("palindrome olup olmadigini ogrenmek istediginiz input u giriniz");
        String input=scan.nextLine();
        palinMi(input);





    }

    public static void palinMi(String input) {
        String sonYazi="";

        for (int i = input.length()-1; i >=0 ; i--) {
            sonYazi=sonYazi+input.charAt(i);

        }

        if (sonYazi.equals(input)){
            System.out.println("girilen yazi bir palindrome dir");
        }else {
            System.out.println("girilen yazi palinrome degildir");
        }
    }
}
