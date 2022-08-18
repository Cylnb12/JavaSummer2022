package day30_immutable_date;

import java.time.LocalTime;

public class C05_StringVsStringBuilder {
    public static void main(String[] args) throws InterruptedException {

        /*
        String mi yoksa String builder mi daha hizlidir
         */

        String str="sakdfm;akdmf;kl";
        LocalTime zaman=LocalTime.now();
        System.out.println("zaman1 = " + zaman);

        for (int i = 0; i < 1000; i++) {
            str+=".";

        }
        System.out.println();
        LocalTime zaman1=LocalTime.now();
        System.out.println("zaman1 = " + zaman1);

        StringBuilder str1=new StringBuilder("sakdfm;akdmf;kl");
        for (int i = 0; i < 1000; i++) {
           str1.append(".");
        }
        System.out.println();
        LocalTime zaman2=LocalTime.now();
        System.out.println("zaman3 ="+zaman);

        Thread.sleep(3000);
        zaman=LocalTime.now();
        System.out.println("zaman = " + zaman);

        System.out.println("zaman = " + zaman.plusSeconds(10000));

        System.out.println(zaman.minusMinutes(200).minusMinutes(50));//16:13:51.894807600


        System.out.println("     "+ zaman.withHour(3));



    }
}
