package day12_stringManupilation;

public class Day12_Odev4_StringManipulation {
    public static void main(String[] args) {


        String isim="Mehmet ali bey";
        String soyisim="mehmetmehmet";
        isim=isim.replaceAll("\\s","");
        soyisim=soyisim.replaceAll("\\s","");

        System.out.println(isim.length()>soyisim.length()?isim+" isminiz daha uzun ":isim.length()==soyisim.length()
                                                        ?"isminiz ve soyisminiz esit uzunlukta"
                                                        : soyisim+" soyisminiz daha uzun ");

       // String isim="Ali";
       // String soyIsim="Karaslan";
       // isim=isim.replaceAll("\\s","");
       // soyIsim=soyIsim.replaceAll("\\s","");
       // int isimUzunlugu=isim.length();
       // int soyIsimUzunlugu=soyIsim.length();
       // if(isimUzunlugu>soyIsimUzunlugu) {
       //     System.out.println("Kullanicinin ismi, soyisminden daha uzun");
       // } else if (soyIsimUzunlugu>isimUzunlugu) {
       //     System.out.println("Kullanicinin soyismi, isminden daha uzun");
       // }else {
       //     System.out.println("Kullanicinin isim ve soyisim uzunlugu ayni");
       // }


    }
}
