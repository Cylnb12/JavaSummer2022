package day16_forLoop;

public class C06_NestedForLoop {
    public static void main(String[] args) {

        /*
        bazen tek degisken sorunu cozmeye yetmez
        *
        * *
        * * *
        * * * *
        * * * * *
         */
        //3 tane * yan yana yaz
        for (int i = 1; i <=3; i++) {
            System.out.print("* ");

        }
        // yan yana 4 yildiz yazin desek
        for (int i = 1; i <=4; i++) {
            System.out.print("* ");
        }
        System.out.println("");
        // bu tur durumlarda icice(nested)Loop kullanmak gerekir
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");

            }
            System.out.println("");
        }
    }
}
