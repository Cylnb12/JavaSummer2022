package day30_immutable_date;

import java.time.LocalDateTime;

public class C06_LocalDateTime {
    public static void main(String[] args) {

        LocalDateTime tarihSaat =LocalDateTime.now();
        System.out.println(tarihSaat);


        System.out.println(tarihSaat.plusMinutes(3).minusHours(5));

        System.out.println(tarihSaat.toLocalDate());

        System.out.println(tarihSaat.toLocalTime());
        

    }
}
