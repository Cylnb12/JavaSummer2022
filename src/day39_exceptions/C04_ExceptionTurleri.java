package day39_exceptions;

public class C04_ExceptionTurleri {
    public static void main(String[] args) throws InterruptedException {

        String str;

        /*
        System.out.println(str);
        deger atamasi yapmadan bir variable i kullanmaya calisirsaniz
        java compile time da bunu farkede ve size izin vermez
         */

        str=null;
        //System.out.println(str);
        //NullPointerException

        Object obj="Java Java Java";
        Integer sayi=(Integer) obj;//ClassCastException

        /*


        String str2="Hava civa";
        int sayi2=str2;

         Java bazi casting islemlerinde compile time da izin vermez
         bu durumda java kodun caismasina itiraz etmez
         */
        Thread.sleep(5000);


    }
}
