package day24_arrayList_ForEachLoop;

public class C01_Soru1TekrarEdenElYazdir {
    public static void main(String[] args) {



        //Verilen bir Array deki tekrar eden elemntleri yazdirin


        String[] arr={"1","3","4","33","2","3","5","4","6","6","5","12","122",};

        String sayilar="";
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[i].contains(arr[j])){
                   if (!sayilar.contains(arr[j])){
                       sayilar+=arr[j]+" ";
                   }
                }
            }
        }
        System.out.println(sayilar);


    }
}
