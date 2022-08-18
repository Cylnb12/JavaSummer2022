package day24_arrayList_ForEachLoop;

public class C16_StringKarakterleriniForeachIle {
    public static void main(String[] args) {


        String str="Bu Gun Java Cook Guzel";
        String[] arr=str.split("");

        for (String w:arr
             ) {
            System.out.print(w+" ");
        }
    }
}
