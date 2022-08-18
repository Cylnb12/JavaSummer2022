package day18_whileDoWhile;

public class C03_DoWhileLoop {
    public static void main(String[] args) {

/*
whileloopda once kontrol yapip sonra islem yaptigimiz icin
islem bittikten sonra loop un kirilmasi icin bir kez daha basa donulmesi gerekiyor
bu durumda fazladan bir islem yapiliyor
 */
         int sayi=7;

        while (sayi<10){
            System.out.println(sayi);
            sayi++;
        }
/*
do while loop ta bu dez avantaj ortadan kalkar

 */
        sayi=7;
        do{
            System.out.print(sayi+ " ");

            sayi++;
        }while(sayi<10);
    }
}
