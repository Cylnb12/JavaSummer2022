package asd3;

import java.util.Scanner;

public class Asd28_IkiSayiArasiToplama {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("ilk sayiyi giriniz");
        int input1= scan.nextInt();
        System.out.println("ikinci sayiyi giriniz");
        int input2= scan.nextInt();
        aratopla(input1,input2);


    }

    public static void aratopla(int input1, int input2) {
      int sonuc=0;
       if (input1<input2){
           for (int i = input1; i <=input2 ; i++) {
               sonuc=sonuc+i;

           }
       } else if (input1==input2) { sonuc=input1+input2;
           System.out.println("sayilar ayni tpolami = "+sonuc);

       } else  {
           for (int i = input2; i <=input1 ; i++) {
               sonuc=sonuc+i;


           }

       }
        System.out.println(sonuc);
    }
}
