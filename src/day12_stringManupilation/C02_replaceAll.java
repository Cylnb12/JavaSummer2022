package day12_stringManupilation;

public class C02_replaceAll {
    public static void main(String[] args) {

        String str="1Bu2gu3n Ja*va- cok g3uz/el";
        //str bu gun java cok guzel haline getirin
        //replaceAll methodundaki All in amaci ayni ozellikteki tum karakterleri degistirmesidir
        //butun sayilari sil
        //butun ozel karakterleri sil
        //tum ozel karakterleri silelim dedigimizde spaceler de siliniyor
        //spaceleri korumak icin en basta onlarin yerine cumlede bulunmayacak bir string koyalim
        //qazwsx
        str=str.replace(" ","qazwsx");
        System.out.println(str);

       str=str.replaceAll("\\W","");
        System.out.println(str);

        str=str.replaceAll("\\d","");

        //istenmeyen ozel karakterlerden kurtulduk
        //simdi spaceleri geri getirelim


        str=str.replace("qazwsx"," ");
        System.out.println(str);

    }
}
