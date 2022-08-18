package asd;

public class Asd7 {
    public static void main(String[] args) {

        String cumle="Su gibi akip gecer zaman";
        String kelime="k";

        int ilkIndex=cumle.indexOf(kelime);
        int sonIndex=cumle.lastIndexOf(kelime);

        if (ilkIndex==-1){
            System.out.println("bole bise yokk!!");
        } else if (ilkIndex==sonIndex) {
            System.out.println("tamam tamam 1 kere var");

        }else {
            System.out.println("Var hemide fazlasiynann");
        }

    }
}
