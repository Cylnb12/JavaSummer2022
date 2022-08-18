package day40_final;

public abstract class CAbstract {

    /*
    Abstract lar methodlarla ilgilidir
     */
    void toplama(){
        System.out.println("Bu method toplama yapar");
    }

    abstract void carpma();
    abstract void bolme();
     void cikarma(){

    }

    /*
    bir methodun basina abstract yazarsaniz
    bu methodun child class lar icin
    bir standart oldugunu declare etmis olurusunuzve
    method body sine ihtiyac kalmaz

     */
}
