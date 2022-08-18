package day09_ternary;

public class Day09_Odev10_Switch {
    public static void main(String[] args) {

        int input=5;


        switch (input){
            case 10:
                System.out.println("Iki basamakli en kucuk sayi ");
                break;
            case 100:
                System.out.println("Uc basamakli en kucuk sayi ");
                break;
            case 1000:
                System.out.println("Dort basamakli en kucuk sayi ");
                break;
            default:
                System.out.println("Girdiginiz sayiyi degistirin");
        }
    }
}
