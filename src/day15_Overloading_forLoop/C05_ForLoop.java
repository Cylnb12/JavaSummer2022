package day15_Overloading_forLoop;

import java.util.Scanner;

public class C05_ForLoop {
    public static void main(String[] args) {
        //1 den 5 e kadar olan tam sayilari toplayalim

        int toplam=0;
        for (int i = 1; i <=5 ; i++) {
            toplam+=i;


        }
        System.out.println("toplam "+toplam);
        //10 dahil 20 dahil aradaki sayilatri yoplayin


        Scanner scan=new Scanner(System.in);
        System.out.println("sayilari gir entere bas");
        toplam=0;
        for (int i = 30; i <= 50 ; i+=2) {
            toplam+=i;


        }
        System.out.println("10 20 arasi toplam "+toplam);

        toplam=0;
        for (int i = 30; i <= 50; i++) {
            if (i%2==0){
                toplam+=i;
            }

        }
        System.out.println("30-50 arasi cift sayilarin toplami : "+toplam);


        //1500 ile 1600 (sinirlar dahil) arasinda 7 ile bolunebilen sayilati toplayin


        toplam=0;
        for (int i = 1500; i <=1600 ; i++) {
            if (i%7==0){
                toplam+=i;

            }

        }
        System.out.println("1500 1600 arasi 7 ye bolunebilen sayilar toplami : "+toplam);
    }

}
