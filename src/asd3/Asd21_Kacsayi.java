package asd3;

import java.util.Scanner;

public class Asd21_Kacsayi {
    public static void main(String[] args) {

       sayilarTop();


    }


    public static int sayilarTop() {
        Scanner scan=new Scanner(System.in);
        System.out.println("kac sayi toplamak istersiniz");
        int kacsayi= scan.nextInt();
        if (kacsayi>4){
            System.out.println("Cok sayi girdiniz,bu kadar sayiyi toplayamam");

        }else if(kacsayi<2) {
            System.out.println("2, 3, veya 4 sayi gireceginizi belirtiniz");
        }else {
            if (kacsayi==2){
                System.out.println("gireceginiz iki sayiyi aralarinda enter e basarak giriniz");
                int sayi1= scan.nextInt();
                System.out.println();
                int sayi2= scan.nextInt();
                System.out.println("toplam : "+(sayi1+sayi2));
            } else if (kacsayi==3) {
                System.out.println("gireceginiz uc sayiyi aralarinda enter e basarak giriniz");
                int sayi1= scan.nextInt();
                System.out.println();
                int sayi2= scan.nextInt();
                System.out.println();
                int sayi3= scan.nextInt();
                System.out.println("toplam : "+(sayi3+sayi2+sayi1));

            } else if (kacsayi==4) {
                System.out.println("gireceginiz dort sayiyi aralarinda enter e basarak giriniz");
                int sayi1= scan.nextInt();
                System.out.println();
                int sayi2= scan.nextInt();
                System.out.println();
                int sayi3= scan.nextInt();
                System.out.println();
                int sayi4= scan.nextInt();
                int sum=sayi4+sayi3+sayi2+sayi1;
                System.out.println("toplam : "+(sum));

            }
        }
        return kacsayi;
    }
}
