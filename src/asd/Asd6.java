package asd;

import java.util.Scanner;

public class Asd6 {
    public static void main(String[] args) {


        String cumle="Bana oyle bakma anlayacaklar";

        int ilka=cumle.indexOf("n");
        int ikincia=cumle.indexOf("n",ilka+1);

        if (ilka==-1){
            System.out.println("bu cumlede ilka a harfi hok gardas");
        } else if (ikincia==-1) {
            System.out.println("Sadece bir kere geciyo bire birader");

        } else {
            int ucuncua=cumle.indexOf("n",ikincia+1);
            if (ucuncua==-1){
                System.out.println("tamam tamam iki kere var");

            }else {
                System.out.println("uc kere var buldun mutlu oldun mu");
            }
        }
            }

        }




