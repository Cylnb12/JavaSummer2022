package day21_Arrays;

import java.util.Arrays;

public class C10_split {
    public static void main(String[] args) {

        /*
        split methodu bir Array methodu degil string methodudur
        ama Array dondurdugu icin bu konuda anlatiyoruz

        split() ile herhangi bir stringi istedigimiz parcalara bolup istedigimiz sekide kullanabilirz
         */
        String str = "Java, ne kadar guzel.";
        String[] kelmeler=str.split(" ");
        System.out.println(Arrays.toString(kelmeler));//[Java, ne, kadar, guzel]

        String[] kelmelerNe=str.split("ne");
        System.out.println(Arrays.toString(kelmelerNe));//[Java ,  kadar guzel]

        String[] kelmelerE=str.split("e");
        System.out.println(Arrays.toString(kelmelerE));//[Java n,  kadar guz, l]

        String[] karakterler=str.split("");
        System.out.println(Arrays.toString(karakterler));

    }
}
