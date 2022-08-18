package day09_ternary;

public class Day09_Odev11_Switch {
    public static void main(String[] args) {

        char input;
        input='0';



        switch (input){
            case 'S':
            case 's' :
                System.out.println("Software");
                break;
            case 'D':
            case 'd':
                System.out.println("Developer");
                break;
            case 'E':
            case 'e' :
                System.out.println("Engieer");
                break;
            case 'T':
            case 't' :
                System.out.println("In Testing");
                break;
            default:
                System.out.println("Lutfen \"SDET\" harflerinden birini giriniz");
        }
    }
}
