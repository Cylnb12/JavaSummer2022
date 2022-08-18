package day44_collections;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class C05_LinkedList_DequeDataTuru {
    public static void main(String[] args) {

        Deque<String> dql4=new LinkedList<>(Arrays.asList("Cavidan","Mesut","Selim","Tevfik","Selim"));//Deque ==>  double ended que
        dql4.removeLastOccurrence("Selim");
        dql4.removeFirstOccurrence("Hasan");
        System.out.println(dql4);
        System.out.println(dql4.pop());
        //pop()  //LinkList in basindaki elementi silip bize dondurur

        System.out.println(dql4);
        dql4.remove();
        dql4.removeFirst();
        dql4.removeLast();
        //// Deque iki tarafli queue demektir, dolayisiyla her method'un first ve last'i var


    }
}
