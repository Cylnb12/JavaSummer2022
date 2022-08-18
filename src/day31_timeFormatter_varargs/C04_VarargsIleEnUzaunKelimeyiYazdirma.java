package day31_timeFormatter_varargs;

public class C04_VarargsIleEnUzaunKelimeyiYazdirma {
    public static void main(String[] args) {

        enUzunKelimeyiYazdir("ali","ayse","Ismail","ahmet","Abdurrezzak");

    }

    public static void enUzunKelimeyiYazdir(String ...ismail) {
        String kiyas=ismail[0];

        for (String each:ismail
             ) {
            if (each.length()>kiyas.length()){
                kiyas=each;
            }
        }
        System.out.println("en uzun kelime "+kiyas);


    }
}
