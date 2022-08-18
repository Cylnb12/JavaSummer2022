package day18_whileDoWhile;

public class C01_WhileLoop {
    public static void main(String[] args) {

        /*
        Soru 4 ) Kullanicidan baslangic ve bitis haflerini alin
        ve baslangic harfinden baslayip bitis harfinde biten
        tum harfleri buyuk harf olarak ekrana yazdirin.
        Kullanicinin hata yapmadigini farz edin.
         */
        char ilkHarf='f';
        char sonHarf='t';

        String buyult="";

        while (ilkHarf<=sonHarf){
            buyult=(ilkHarf+"").toUpperCase();//ilkharf char old. icin   +"" yaparak stringe cevirmis olduk
            //cunku char'da toUppercase yapamayiz
            System.out.print(buyult+" ");
            ilkHarf+=1;
        }




    }
}
