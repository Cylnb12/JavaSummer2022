package day30_immutable_date;

import java.time.LocalTime;

public class C04_LocalTime {
    public static void main(String[] args) throws InterruptedException {

        LocalTime time1=LocalTime.now();
        System.out.println(time1);//19:12:04.255655200
        /*
        bizim olusturdugumuz date ve time canli tarih ve saat degildir
        LOcalTime.Now() kullandigimiz satirda bizim variable imiza store eder

        time1 variable nin degeri SABITTIR.
         */

        Thread.sleep(3000);
        time1=LocalTime.now();

        System.out.println(time1);//
        /*

         */

    }
}
