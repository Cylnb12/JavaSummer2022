package day10_stringManipulation;

public class C06_indexOf {
    public static void main(String[] args) {

        String str="Java ogrenmek cok guzel";
        System.out.println(str.indexOf("o"));// 5
        System.out.println(str.indexOf('g'));// 6

        System.out.println(str.indexOf("t"));// bana integer donduruyor
                                            // int de yok diye bir deger var mi : yok
                                            // 0(sifir) donerse J nin degeri olur
                                            // negatif deger(-1) verirse anla ki boyle bir deger yok
        String str5= "wertyuiafdaiofsdjnfjdspnfvandfmavdfdfkma";
        //str 5 te p harfi var midir

        if (str5.indexOf("p")==-1){
            System.out.println("str5 te istenen karakter kullanilmamis");
        }else {
            System.out.println("str5 te istenilen karakter kullanilmis");
        }



    }
}
