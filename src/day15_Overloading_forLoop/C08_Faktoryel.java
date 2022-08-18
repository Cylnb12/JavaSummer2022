package day15_Overloading_forLoop;

public class C08_Faktoryel {
    public static void main(String[] args) {

        /*
        input olarak verilen bir tam sayi icin faktoriyel hesaplayip yazdiran bir
        method olusturun

        verilen sayi   negatif veya 20 den buyuk olursa
        girilen sayinin faktoriyeli hesaplanamaz uyarisi yazdirin

         */
        int input=16;
        faktrolyelHesapla(input);
    }

    public static void faktrolyelHesapla(int input) {

        int faktoryel=1;

        if (input<0||input>20){
            System.out.println("verilen sayi icin faktoryel hesaplanamaz");
        }else if (input==0){
            System.out.println("0!  =  1' dir");

        }else {
            for (int i = 1; i <=input ; i++) {
                faktoryel*=i;

            }
            System.out.println("Faktoryel degeri : "+faktoryel);
        }

    }
}
