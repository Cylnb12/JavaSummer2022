package day05_matematikselIşlemler;

public class C01_Pre_Post_Increment {
    public static void main(String[] args) {

        int sayi1=10;
        int sayi2= sayi1+1;
        sayi2 +=5;



        int sayi3=sayi2++;
        System.out.println(sayi3);

        int sayi4=++sayi1;
        System.out.println(sayi4);

    }
}
