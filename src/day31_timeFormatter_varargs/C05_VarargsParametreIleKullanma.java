package day31_timeFormatter_varargs;

public class C05_VarargsParametreIleKullanma {
    public static void main(String[] args) {

        enUzunKelimeyiYazdir(5,"Ali","ayse","Ismail","ahmet","Abdurrezzak");

    }
/*
Varargs teorik olarak sonsuz sayida elemnt alabilir
bir methodda parametre olarak varargs varsa
varargsin en sinirlarini bilebilmesi icin
varargs
parametrelerin sonuncusu olmalidir.

oncesinde farkl parametreler olabilir ama
varargsdan baska parametre olamaz

bu kuraldan oturu bir methodda sadece bir tane varargs olabilir

*/
    public static void enUzunKelimeyiYazdir(int kelimeSayisi,String ...kelime) {
        String kiyas=kelime[0];

        for (String each:kelime
        ) {
            if (each.length()>kiyas.length()){
                kiyas=each;
            }
        }
        System.out.println("en uzun kelime "+kiyas);


    }
}
