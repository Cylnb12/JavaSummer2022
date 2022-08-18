package day32_stringBuilder;

public class C02_Append {
    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder("Java daha ne yapsin");

        sb.append("?");

        System.out.println(sb);//Java daha ne yapsin?

        // append istedigimiz String ifadeyi en sona ekler

        sb.insert(4,"java her seyi dusunmus, ");
        System.out.println(sb);//Javajava her seyi dusunmus ,  daha ne yapsin?

        //araya ekleme yapmak istedigimizde append degil insert kullanmaliyiz


        sb.insert(26,"valla valla",5,11);
        System.out.println(sb);

        sb.setCharAt(3,'k');
        System.out.println(sb);

        System.out.println(sb.toString().toUpperCase());

    }
}
