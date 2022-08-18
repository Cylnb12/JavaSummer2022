package day18_whileDoWhile;

public class C02_WhilwLoop {
    public static void main(String[] args) {

        //kullanicidan bir sayi alin ve bu sayinin rakamlari toplamini yazdirin

        int input=54321;

        int rakamlarToplami=0;
        int birlerBasamagi=0;
        int temp=input;

        while (temp>0){
            birlerBasamagi=temp%10;
            rakamlarToplami+=birlerBasamagi;
            temp/=10;

        }
        System.out.println(input+" sayisinin rakamlar toplami "+rakamlarToplami);

    }
}
