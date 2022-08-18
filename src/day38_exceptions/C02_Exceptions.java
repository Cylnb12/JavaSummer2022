package day38_exceptions;

public class C02_Exceptions {
    public static void main(String[] args) {



        int a=100;
        int b=50;
        int sayac=1;

        while (sayac<1000){
/*
try blogu yapmaya calistigimiz ama risk oldugunu dusundugumuz islemleri yazmak
icin kullanilir
catch den sonraki parantez karsilasmayi bekledigimiz excepton
turunu javaya soylemek icin kullanilir
catch blogu : Javaya soyledigimiz exception(istisna) gerceklesirse
javanin yapmasini istedigimiz islem
        catch blogunun onundeki paranteze karsiasmayi bekledigimiz exception u yazabilir
        veya her turlu exception da devreye girmesini istiyorsak
        tum exceptionlarin parenti olan Exception yazabiliriz
 */
            try {
                System.out.println(a/b);
            } catch (Exception e) {
                System.out.println("payda 0 oldu, dikkat");
            }

            b--;
            sayac++;
        }


    }
}
