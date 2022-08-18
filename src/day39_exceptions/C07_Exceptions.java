package day39_exceptions;

import java.util.Scanner;

public class C07_Exceptions {
    public static void main(String[] args) {

        /*
String str[],Urun isimlerini tuttugumuz bir array olsun
Kullanicidan istedigi urunu sirasini isteyin
ve istedigi urunu yazdirin
Kullanici array de olan urun sayisindan buyuk bir sira no girerse
"Girdiginiz sira urun sayisindan buyuk" yazdirin
 */

        Scanner scan=new Scanner(System.in);

        String str[]={"Elma","Armut","Seftali","Kiraz","Kayisi"};
        System.out.println("Istediginiz urunun index no sunu giriniz");
        try {
            int index=scan.nextInt();
            System.out.println(str[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("!!!Girdiginiz sira urun sayisindan buyuk!!!");
        }


    }
}
