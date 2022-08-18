package day44_collections;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class C04_LinkedList_QueueDataTuru {
    public static void main(String[] args) {

        Queue<String> ql3=new LinkedList<>(Arrays.asList("Adem","Zeynep","Hpolat","Kadir"));




        // Queue kuyruk demektir , sira onemlidir
        //gelen sona gelir, giden bastan gider

        System.out.println(ql3);//[Adem, Zeynep, Hpolat, Kadir]

        System.out.println("ql3.remove() = " + ql3.remove());
        System.out.println(ql3);
        System.out.println("ql3.remove(\"Hpolat\") = " + ql3.remove("Hpolat"));
        System.out.println(ql3);

        System.out.println(ql3.element());//Zeynep
        System.out.println(ql3.peek());//Zeynep


        Queue<String> ql5=new LinkedList<>();
        //System.out.println(ql5.element());  //throw an exception==>NoSuchElementException
        System.out.println(ql5.peek());//null

        // peek ve element silmeden ilk elementi bize dondurur
        //Aralarindaki fark bos liste olursa peek null doner, element exception firlatir

        ql3.offer("Ahmet");
        ql3.offer("Sefa");
        System.out.println(ql3);//[Zeynep, Kadir, Ahmet, Sefa]

        System.out.println(ql3.poll());//Zeynep
        System.out.println(ql3);//[Kadir, Ahmet, Sefa]

        //ql5.remove();  // NoSuchElementException
        System.out.println(ql5.poll());// null



    }
}
