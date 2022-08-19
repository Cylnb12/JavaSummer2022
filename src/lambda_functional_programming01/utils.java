package lambda_functional_programming01;

public class utils {
    public static void ayniSatirdaBosluklaYazdir(Object obj) {
        System.out.print(obj + " ");
    }

    public static boolean CiftleriAl(Integer x) {
        return x % 2 == 0;
    }

    public static boolean tekElemanSec(Integer x) {
        return x % 2 != 0;
    }

    public static int kareal(Integer x) {
        return x * x;
    }

    public static int kupunuAl(Integer x) {
        return x * x * x;
    }
    public static double yariyaBol(double x){
        return x/2.0;
    }
}
