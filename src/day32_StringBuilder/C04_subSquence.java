package day32_stringBuilder;

public class C04_subSquence {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Kayra");

        sb.substring(0,3);
        // bu method string dondurdugu icin String builder in eski halini degistiremez

        System.out.println(sb);//Kayra


        sb.subSequence(0,3);
        System.out.println(sb);//Kayra


    }
}
