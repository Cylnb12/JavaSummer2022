package day12_stringManupilation;

public class Day12_Odev3_StringManipulations {
    public static void main(String[] args) {


      // Scanner scan=new Scanner(System.in);
      // System.out.println("Lutfen bir isim giriniz");
      // String isim =scan.nextLine();
      // if (isim.contains("a")&&isim.contains("Z")){
      //     System.out.println("Girdiginiz isim hem a harfı hemde Z harfi iceriyor");
      // } else if (isim.contains("a")) {
      //     System.out.println("Girdiginiz isim a harfi iceriyor");
      // } else if (isim.contains("Z")) {
      //     System.out.println("Girdiginiz isim Z harfi iceriyor");
      // }else {
      //     System.out.println("Girdiginiz isim ne a harfi nede Z harfi icermiyor");
      // }
      // Collapse


        String isim ="a";

        if (!isim.contains("a")){
            if (!isim.contains("Z")){
                System.out.println("isim a ve Z harfi icermiyor");
            }else {
                System.out.println("Isim Z harfi iceriyor");
            }

        }else if (isim.contains("a")&&!isim.contains("Z")){
            System.out.println("Isim a harfi iceriyor");
        }else {
            System.out.println("Isim a ve Z harfini birlikte iceriyor");
        }










    }
}
