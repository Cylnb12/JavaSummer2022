package day07_ifStatements;

public class C01_AndOperatorleri {

    public static void main(String[] args) {
        int a=10;
        int b=15;
        int c=20;

        System.out.println(a>0 && b<20 && c>=b);

        System.out.println(a<0 && b<20 && c>=b);// ilk falseden sornra digerlerini ignore eder
                                                //daha hizli calisir ve
                                                // bunun yerine asagidaki gibi olsa yavaslar
        System.out.println(a<0 & b<20 & c>=b);



    }

}
