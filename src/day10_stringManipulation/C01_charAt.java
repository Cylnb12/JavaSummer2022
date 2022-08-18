package day10_stringManipulation;

public class C01_charAt {
    public static void main(String[] args) {


        String str="Java ogrenmek ne guzel";

        System.out.println(str.charAt(0)); // ilk harfi yazdiri   J

        System.out.println(str.toUpperCase().charAt(7));// 7. harfi buyutup yazar  R

        System.out.println(str.charAt(21));//  l

        System.out.println(str.charAt(22)); // hata verir Exception
        //son harfi bulmak icin str nin uzunlugunun 1 eksigini index olarak gireriz




        // charAt metodu kullandigimizda sonuc char olacagi icin artik manipulasyon yapamayiz
        //string metodlarindan kullanmamiz gereken bir metod varsa charAt den once kullanmaliyiz

    }
}
