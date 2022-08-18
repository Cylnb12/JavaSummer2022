package day18_whileDoWhile;

public class C05_DoWhileLoop {
    public static void main(String[] args) {
        //9 dan 190 a kadar 7 nin kati olan
        //tum tam sayilari ekrana yazdiriniz

        int bas = 9;
        int bit = 190;

        int temp = bas;

        while (temp < bit) {

            if (temp % 7 == 0) {
                System.out.print(temp + " ");

            }
            temp++;
        }
        System.out.println("");

        do {
            if (temp % 7 == 0) {
                System.out.print(temp + " ");

            }
            temp++;
        }while (temp<bit);
    }
}