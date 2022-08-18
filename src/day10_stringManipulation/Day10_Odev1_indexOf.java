package day10_stringManipulation;

public class Day10_Odev1_indexOf {
    public static void main(String[] args) {


        String kelime = "bakkalda bazen guzel seyler olabiliyor";
        String harf = "b";

        if (kelime.indexOf(harf) == -1) {
            System.out.println("Harf cumlede bulunmuyor");
        } else System.out.println("Harf cumlede var");

        if (!kelime.contains(harf)){
            System.out.println("Icermiyor");
        }else {
            System.out.println("Iceriyor");
        }


        System.out.println(kelime.contains(harf)?"Bu harf var dedik yaww":"Bu da olmasin tamam neyse");



    }
}
