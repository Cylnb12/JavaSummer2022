package day12_stringManupilation;

public class Day12_Odev1_StringManipulations {
    public static void main(String[] args) {

        String input=" Java ogrenmek123 Cok guzel@ ";
        input=input.replaceAll("\\s","asdasd");
        input=input.replaceAll("\\W","");
        input=input.replaceAll("\\d","");
        input=input.replaceAll("asdasd"," ");
        input=input.replace("C","c");
        input=input.trim();
        System.out.println(input+".");
    }
}
