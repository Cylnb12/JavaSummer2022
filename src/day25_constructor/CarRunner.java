package day25_constructor;

public class CarRunner {
    public static void main(String[] args) {
        Car car1=new Car();
        car1.fiyat=150000;
        car1.yil=2020;
        car1.marka="Toyota";

        System.out.println("Marka : "+car1.marka+"\n"+
        "Model : "+car1.model+"\nyil : "+ car1.yil+"\nFiyat : "+ car1.fiyat);

        System.out.println();
        Car car2=new Car();
        System.out.println("Marka : "+car2.marka+"\n"+
                "Model : "+car2.model+"\nyil : "+ car2.yil+"\nFiyat : "+ car2.fiyat);



        /*
        Herhangi bir obje uzerinden bir variable yazdirmaya calistigimizda
        java degeri su sekilde atar

        1- o obje olusturulduktan sonra bir deger atandi mi?
        2- Objenin olusturuldugu Class da variable da bir deger atanmis mi bakar
        3- O zaman data turune gore Java Default degeri atar

         */


    }
}
