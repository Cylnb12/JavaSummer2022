package day22_multiDimensionalArray;

import java.util.Arrays;

public class C12_EsitElemanKaldirma {
    public static void main(String[] args) {

        int[] arr2={7,7,8,8,9,10,11,7,11,0,12};
        int esit=7;

        esitseKaldir(arr2,esit);

    }

    public static void esitseKaldir(int[] arr2, int esit) {

        String yenisi="";
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i]!=esit){
                yenisi+=arr2[i]+" ";
             }

        }
        String[] yepyenisi =yenisi.split(" ");
        System.out.println(yenisi);
        System.out.println(Arrays.toString(yepyenisi));

    }
}
