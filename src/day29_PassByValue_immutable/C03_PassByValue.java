package day29_PassByValue_immutable;

import java.util.ArrayList;
import java.util.List;

public class C03_PassByValue {
    public static void main(String[] args) {
/*
Bir list olusturalim iki ayrim ethoddan birinde sadece elemanlari degistirelim
digerinde yeni bir list atayip ayni sayida yeni eleman ekleyelim
ve her iki methodcall dan sonra kendi listemizi main method icerisinde kontrol edelim
 */
        List<String> list=new ArrayList<>();
        list.add("Ali");
        list.add("Veli");
        list.add("Can");

        System.out.println("ilk basta list"+list);//ali, veli ,can

        elmanlariDegistir(list);
        System.out.println("eleman degistri methodundan sonra istemiz "+list); //oguz, Murat, Fatih

        listDegistir(list);

        System.out.println("ListDegistir mehodundan sonra list "+list);//Oguz, murat, fatih
    }

    public static void listDegistir(List<String> list) {

        list=new ArrayList<>();

        list.add("Nutella");
        list.add("Cay");
        list.add("Cokokrem");
        System.out.println("list degistir methodunda "+list);//nutella, cay ,cokokrem

    }

    public static void elmanlariDegistir(List<String> list) {
        list.set(0,"Oguz");
        list.set(1,"Murat");
        list.set(2,"Fatih");

        System.out.println("elemandegistir methodunda listemiz"+list);//oguz, murat, fatih


    }
}
