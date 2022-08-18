package day24_arrayList_ForEachLoop;

import java.util.Arrays;
import java.util.List;

public class C07_ArraydenArrayListYapmak {
    public static void main(String[] args) {

        String[] arr={"ismail","nurullah","fatih"};
        /*
        uzun listeler olusturmamiz gerektiginde;
        tek tek eklemek yerine Array olusturup bunlari list e cevirmek
        daha pratik olabilir
        1-loop ile array deki tum elementleri list e atabiliriz
        2-Arrays.asList() kullanilablir
            Ancak bu method un iki yan etkisi var
            - Arrays class i kullanildigi icin array ozellikleri gecerli olur
            dolayisiyla List te olan add, remove gibi size i degistiren methodlar
            bu sekilde olusturulan Listlerde kullanilamaz
            - kaynak olan Array ile urun olan List ozdeslerstirilir
            birinde yapilan degisiklik otomatik olarak digerine de islenir


         */
        List<String> sinifList= Arrays.asList(arr);
        System.out.println(sinifList);//[ismail, nurullah, fatih]
        //1.yan etki
        //sinifList.add("erdi");//UnsupportedOperationException
        //sinifList.remove(1);//UnsupportedOperationException

        //2.yan etki

        arr[1]="Emre";
        System.out.println("degisim sonrasi array  "+Arrays.toString(arr));
        System.out.println(" Array i degistirince list  "+ sinifList);
        sinifList.set(0,"utku");
        System.out.println("list i degistirince list"+sinifList);
        System.out.println(Arrays.toString(arr));


    }
}
