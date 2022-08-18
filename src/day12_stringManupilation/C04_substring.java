package day12_stringManupilation;

public class C04_substring {
    public static void main(String[] args) {


        String str="Java cok yasa";

        System.out.println(str.substring(3,4)); //a

        System.out.println(str.substring(5,7));//co

        System.out.println(str.substring(6,6));//""

        System.out.println("+++");
        System.out.println(str.substring(12,13));

       // System.out.println(str.substring(6,2));;// Exception

        String str2="23";



        //compile time error = CTE  (Altini ciziyorsa)
        //run time error     = RTE   (sonradan hata veriyorsa)

    }
}
