package day24_arrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C03_Soru3QSonluListe {
    public static void main(String[] args) {

        /*
        Kullanici Q ya basincaya kadar girecegi isimleri alarak
        bir liste olusturup bu isimleri bir list olarak bize donduren
        bir method olusturun
         */


        List<String> liste=new ArrayList<>();
        liste=inputtanListeOlustur();
        System.out.println(liste);


    }

    private static List<String> inputtanListeOlustur() {
        Scanner scan=new Scanner(System.in);
        String input="";
        List<String> liste=new ArrayList<>();
        do {
            System.out.println("Lutfen listeye eklemek istediginiz String i giriniz\n" +
                    "Cikmak icin Q'ya basiniz");
            input= scan.nextLine();
            if (input.equals("Q")) {
                break;
            }else {
                liste.add(input);
            }



        }while (!input.equals("Q"));

        return liste;
    }
}
