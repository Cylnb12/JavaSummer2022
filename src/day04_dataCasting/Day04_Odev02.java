package day04_dataCasting;

public class Day04_Odev02 {
    public static void main(String[] args) {
        float sayi=102f;

        System.out.println("sayi = " + sayi);

        long sayi1= (long) sayi;

        System.out.println("sayi1 = " + sayi1);

        int sayi2= (int) sayi1;

        System.out.println("sayi2 = " + sayi2);

        short sayi3=(short) sayi2;

        System.out.println("sayi3 = " + sayi3);

        byte sayi4=(byte) sayi3;
        System.out.println("sayi4 = " + sayi4);

    }
}
