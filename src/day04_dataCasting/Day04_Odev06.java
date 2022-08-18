package day04_dataCasting;

public class Day04_Odev06 {
    public static void main(String[] args) {

        byte a = 10;
        short b = 20;
        int c = 30;
        long d = 40;
        float e = 50.50f;
        double f = 60.60;

        System.out.println("a/b = "+ a/b);
        // sonuc ondalıklı oldugu ve byte ve short desteklemediği için 0 yazdırıyor..

        System.out.println("a/b = "+ (float)a/b);

        System.out.println("f*a = "+ f*a);
        // double hepsini kapsadığı için sıkıntı yapmadı..

    }
}
