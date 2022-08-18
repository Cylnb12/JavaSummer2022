package day24_arrayList_ForEachLoop;

public class C14_ArraydekiSayilarCarpimiForeach {
    public static void main(String[] args) {

        //Bir Array deki tum sayilarin carpimini Froeach ile bulup yazdiralim
        int sum=0;

        int[] sayilar={2,3,4,1,5,7,6,5,4,3};

        for (int each:sayilar
             ) {
            sum+=each*each;
        }
        System.out.println(sum);


    }
}
