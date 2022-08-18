package asd;

public class Asd5 {
    public static void main(String[] args) {

        String str1="Benim adim dertli dolap";
        String str2="benim adIM dertli Dolap";

        System.out.println(str1.length());//23

        System.out.println(str1.toUpperCase().charAt(6));//A

        System.out.println(str1.charAt(str1.length()-1));//p

        System.out.println(str1.equalsIgnoreCase(str2)); //true

        System.out.println(str1.indexOf(6)); //-1

        System.out.println(str1.indexOf("e"));//1









    }
}
