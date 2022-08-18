package asd;

public class Asd9 {
    public static void main(String[] args) {
        String cumle="Kendisi kucuk islevi buyuk";

        if (cumle.contains("buyuk")&&cumle.contains("kucuk")){
            System.out.println("bi karar ver buyuk mu yazdirayim kucuk mu");
        } else if (cumle.contains("buyuk")) {
            System.out.println(cumle.toUpperCase());

        } else if (cumle.contains("kucuk")) {
            System.out.println(cumle.toLowerCase());

        }else {
            System.out.println("cumle kucuk yada buyuk kelimesi icermiyor");
        }
    }
}
