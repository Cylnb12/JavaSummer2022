package day29_PassByValue_immutable;

import java.util.Arrays;
import java.util.Random;

public class C02_PassByValue {
    public static void main(String[] args) {
        /*
        birden fazla element iceren Array ve ArrayList gibi yapilarda
        passByValue gecerlidir

        eger methodda Array veya List in kendisi degistirilirse PassByValue Ozelligi
        sabebiyle java degisen degeri degil Array veya list in orijinal degerini alir

        Ancak Array vey List degistirilmeden sadece icindeki elemanlar degistirilirse
        Java obje degismedigi icin(referans ayni) ayni array veya list i bize dondurur
        ancak icindeki elementler degismis olacaktir
         */
        /*
        verilen 4 elemanli bir array i
        method a gonderelim
        methodda yrni 3 elemanli bir array atayip
        bu yeni array e rastgele 100 den kucuk 3 sayi atayalim
        methodda array i yazdiralim

        main methodda da method call dan sonra yeniden method u yazdiralim

         */

        int[] arr={3,5,8,10};
        arrayiDegistir(arr);
        System.out.println("methodcall dan sonra manin de "+Arrays.toString(arr));

    }

    public static void arrayiDegistir(int[] arr) {
        Random rnd=new Random();
        arr=new int[3];
        arr[0]= rnd.nextInt(100);
        arr[1]= rnd.nextInt(100);
        arr[2]= rnd.nextInt(100);

        System.out.println("methodda "+Arrays.toString(arr));

    }
}
