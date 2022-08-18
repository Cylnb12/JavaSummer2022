package asd2;

public class Asd10 {
    public static void main(String[] args) {

        String input="asd@gmail.com";

        if (!input.contains("@gmail.com")){
            System.out.println("Dogru duzgun bir email adresi giriniz");
        } else if (input.endsWith("@gmail.com")) {
            System.out.println("He gardas senin emaili kaydettik sikinti yok ");

        }else {
            System.out.println("istersen bi duzelt tekrar dene");
        }
    }
}
