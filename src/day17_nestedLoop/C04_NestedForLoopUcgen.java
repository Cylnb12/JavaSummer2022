package day17_nestedLoop;

public class C04_NestedForLoopUcgen {
    public static void main(String[] args) {

        /*
        verilen inputa gore * lardan olusan bir ucgen olusturun
        orn: input=4 ise

                   *
                   * *
                   * * *
                   * * * *

         */

        int input=10;
        for (int i = 1; i <=input ; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");

            }
            System.out.println("");
        }
        System.out.println();
        for (int i = input-1; i >=1 ; i--) {
            for (int j = i; j >=1 ; j--) {
                System.out.print("* ");
            }
        }System.out.println("");

    }
}
