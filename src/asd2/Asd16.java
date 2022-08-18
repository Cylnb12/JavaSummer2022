package asd2;

import java.io.Serializable;
import java.util.Scanner;

public class Asd16 {
    public static void main(String[] args) {
        //Kullanıcıdan bir isim yazmasını isteyin, adın uzunluğu 3 olmalıdır. Ardından,
        // adın aynı karakterlere sahip olup olmadığını kontrol edin.
        //
        //Eger aynı karakterlere sahipse
        //
        //"isim ayni karakterlere sahiptir." yazdirin.
        //
        //Eger ayni kaakterlere sahip degilse
        //
        //"Dizenin benzersiz karakterleri var" yazdirin.
        //
        //Ternary kullanin

        Scanner scan =new Scanner(System.in);

        String input=scan.next();
        System.out.println(input.length() > 3 ? " " :input.charAt(0)==input.charAt(1)||
                input.charAt(2)==input.charAt(0)||input.charAt(1)==input.charAt(2)?"isim ayni karakterlere sahip":
                "Dizenin benzersiz karakterleri var");
    }
}
