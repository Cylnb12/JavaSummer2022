package day32_stringBuilder;

public class C03_reverse {
    public static void main(String[] args) {

        //verilen bir input 'u tersine cevirip bize donduren bir method olusturun
        StringBuilder sb=new StringBuilder("hey gidi java");
        System.out.println(sb.reverse());

        String input="hey gidi for loop gunleri";

        String tersinput=tersinecevir(input);
        System.out.println(tersinput);


        //int ifadeyi ters cevirmeyi dene********************

        int tersolacak=123456789;
        int sayidondur=intDondur(tersolacak);
        System.out.println(sayidondur);
        int islem=sayidondur+10;
        System.out.println(islem);


    }

    public static int intDondur(int tersolacak) {



        StringBuilder sbint=new StringBuilder(""+ tersolacak).reverse();

        Integer donmusInt=Integer.parseInt(""+sbint);


        return donmusInt;
    }

    public static String tersinecevir(String input) {
        StringBuilder sb=new StringBuilder(input);

        return sb.reverse().toString();

    }
}
