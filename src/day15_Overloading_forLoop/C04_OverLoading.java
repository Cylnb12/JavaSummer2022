package day15_Overloading_forLoop;

public class C04_OverLoading {
    public static void main(String[] args) {


        topla(5,7);// 12 int,int
        topla(5.2,3);//8.2 doble,int
        topla(3.4,6.1);//9.5 double,double
        topla(5,6.2);//

    }
/*
Java hangi methodun calisacagina karar verirken optimizasyon yapar
-eger hic cast yapmadan kullanabilecegi bir method vara onu kullanir
-eger cast yapmadan kullanacagi bir method yoksa en az cast yaparak
kullanabilecegi methodu tercih eder
 */
    public static void topla(int sayi1,int sayi2){
        System.out.println("iki integer in toplami  : "+(sayi1+sayi2));
    }

    public static void topla(double sayi1,int sayi2) {
        System.out.println("bir double ve bir integer in toplami  : " + (sayi1 + sayi2));
    }



    public static void topla(double sayi1,double sayi2){
        System.out.println("iki double in toplami  : "+(sayi1+sayi2));
    }
    public static void topla(double sayi1,double sayi2,double sayi3){
        System.out.println("uc double in toplami  : "+(sayi1+sayi2+sayi3));
    }
}


