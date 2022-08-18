package day21_Arrays;

import java.util.Arrays;

public class C05_ArrayeElementEkleme {
    public static void main(String[] args) {
        //Soru 5- Verilen bir array’e yeni bir element ekleyen method donderin


        String[] sinifList={"Alican","Nida Yucedal","Musa Yaman"};
        String eklenecekIsim="Murat Babayigit";

        sinifList=elemanEkle(sinifList,eklenecekIsim);
        System.out.println(Arrays.toString(sinifList));
    }

    public static String[] elemanEkle(String[] sinifList, String eklenecekIsim) {
        String[] yeniliste=new String[sinifList.length+1];
        //eski listeden 1 eleman fazla yeni liste olusturdum
        for (int i = 0; i <sinifList.length ; i++) {
            yeniliste[i]=sinifList[i];
        }
        //oncelikle eski listedeki tum elemanari yeni listeye tasidim
        yeniliste[yeniliste.length-1]=eklenecekIsim;
        //son index e ise eklenecek ismi atadim


        return yeniliste;
    }
}
