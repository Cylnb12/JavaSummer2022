package day25_constructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C02_Contractor {
    public static void main(String[] args) {

        C01          obj1=          new          C01();
//   Class adi     objenin adi     keywodr     constractor
        System.out.println(obj1.sayi);
        obj1.deneme();//"C01 den deneme methodu calisir"

        Scanner scan=new Scanner(System.in);
        Random rnd=new Random();
        List<String> list=new ArrayList<>();
        //List<String> list2=new List<>();
        /*
        Javada bir obje olusturabilmek icin
        mutlaka constractor kullanmalisiniz
         */


        System.out.println(obj1.sayi);

        obj1.deneme();

    }
}
