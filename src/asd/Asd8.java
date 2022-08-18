package asd;

public class Asd8 {
    public static void main(String[] args) {

        String cumle="asd@hotmail.com";


        if (!cumle.contains("@hotmail.com")){
            System.out.println("Gardas adam gibi bir e mail girsene");
        }else {
            if (!(cumle.lastIndexOf("@hotmail.com")==cumle.length()-12)){
                System.out.println("gardas bi kontrol ediver");
            }else {
                System.out.println("emailin kaydedildi gardas sen sikinti yapma");
            }
        }

    }
}
