package day36_InheritanceDataTypeKullanimi;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DIsci extends BMuhasebe {

    protected int saatUcreti=11;
    protected int gunlukMesai=7;

    protected void maasIsci(){
        System.out.println("Isciler  : "+(30*gunlukMesai*saatUcreti)+" maas alir");
    }
    protected void ozelSigortaIsci(){
        System.out.println("Isciler %70 indirimli sigorta yaptirabilirler");
    }

    public static void main(String[] args) {



        BMuhasebe isci1=new DIsci();

        /*
        Bir obje olustururken Data turu ve constructor ayni class dan ise
        direk o class a gidiyorduk

        Eger Data turu ve Constructor farkli ise
        Obje constructor un oldugu class in objesidir
        ancak bizden istenen
        Isci class indaki spesifik ozellikler degil
        nir iscinin muhasebe class indaki tum calisanlarla beraber
        sahip oldugu genel ozellikleri istiyoruz


         */

        System.out.println(isci1.gunlukMesai);//M 8
        System.out.println(isci1.saatUcreti);//M 10
        isci1.maas();//M
        isci1.ozelSigorta();// M
        isci1.sigorta();// P
        System.out.println(isci1.isim);//P
        System.out.println(isci1.soyisim);//P
        System.out.println(isci1.departman);//P

        APersonel isci2=new DIsci();

       // System.out.println(isci2.gunlukMesai);//M 8
       // System.out.println(isci2.saatUcreti);//M 10

        isci2.maas();
       // isci2.ozelSigorta();// M
        isci2.sigorta();// P
        System.out.println(isci2.isim);//P
        System.out.println(isci2.soyisim);//P
        System.out.println(isci2.departman);//P

/*
Eger Data turu olan class da aradigimiz ozellik yoksa
varsa onun parent ina gidebilir
ama child a donus olmaz
Aradigi ozelligi bulamazsa CTE verir


 */

        List<String>  List1 =new LinkedList<>();
        Deque<String> List2 =new LinkedList<>();
        Queue<String> List3 =new LinkedList<>();

        /*
        Hepsi Linked List olsa da
        list1 list gibi davranir
        list2 Deque gibi davranir
        list1 Queue gibi davranir

         */


    }

}
