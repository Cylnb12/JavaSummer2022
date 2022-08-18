package day03_scanner;

public class C02_Swap {
    public static void main(String[] args) {
        int sayi1=10;
        int sayi2=20;
        int sayi3=0;

        System.out.println("Sayı1=  "+sayi1);
        System.out.println("Sayı2=  "+sayi2);

        sayi3=sayi2;
        sayi2=sayi1;
        sayi1=sayi3;

        System.out.println("Swaptan sonra Sayı1=  "+sayi1);
        System.out.println("swaptan sonra Sayı2=  "+sayi2);
































        int a=50;
        int b=70;
        int c=0;

        System.out.println("a: "+a);
        System.out.println("b: "+b);

        c=a;// c 50
        a=b;// a 70
        b=c;// b 50

        System.out.println("a  :"+a);
        System.out.println("b  :"+b);


    }
}
