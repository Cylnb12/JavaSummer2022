package day33_encapsulation;

public class Araba {

    String marka="Marka belirtilmedi";// markanin access modifier i default oldugundan package icerisinden kullanilabilir
    private String model="Model belirtilmedi";
    private String yakit="Elektrikli";//Tum arabalar elektrikli ise bu variable in degistirilmemesi lazim

    public void setModel(String model) {
        this.model = model;
    }


    public String getYakit() {
        return yakit;
    }

}
