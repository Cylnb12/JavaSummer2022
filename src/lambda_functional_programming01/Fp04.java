package lambda_functional_programming01;

import java.util.stream.IntStream;

public class Fp04 {
    public static void main(String[] args) {
        System.out.println(get7den100eToplam());
        System.out.println(get7den100eToplam2());
        System.out.println("2 den 11 e kadar carpim sonucu= "+ikiden11eCarpim());
        System.out.println("1 den x e kadar carpim sonucu= "+faktoriyelHesapla(5));


    }
    //1) 7'den 100'e kadar integer değerlerinin toplamını bulan bir method oluşturun.
public static int get7den100eToplam(){//1.yol
    return IntStream.range(7,101).reduce(Math::addExact).getAsInt();
}
    public static int get7den100eToplam2() {//2.yol
        return IntStream.rangeClosed(7, 100).reduce(Math::addExact).getAsInt();
    }
    //2) 2'den 11'e kadar integer değerlerinin çarpımını bulan bir method oluşturun.
public static int ikiden11eCarpim(){
        return IntStream.rangeClosed(2,11).reduce(Math::multiplyExact).getAsInt();
    }
//3) Verilen bir sayının faktoriyelini hesaplayan bir method oluşturun. (5 factorial = 1*2*3*4*5  ==> 5! = 1*2*3*4*5)
public static int faktoriyelHesapla (int x){
        return IntStream.rangeClosed(1,x).reduce(Math::multiplyExact).getAsInt();
}


}
