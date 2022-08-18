package day17_nestedLoop;

public class C03_NestedForLoop {
    public static void main(String[] args) {


        /*
        verilen yukseklik ve by degerine gore
        * lardan olsuan bir dikdortgen olsuturalim
        yukseklik :3 boy:4
        * * * *
        * * * *
        * * * *
         */
        int yukseklik=4;
        int boy=8;

        for (int i = 1; i <=yukseklik ; i++) {
            for (int j = 1; j <=8 ; j++) {
                System.out.print("* ");

            }
            System.out.println("");

        }

    }
}
