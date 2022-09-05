package com.company;
interface biCycle{
    int a = 45; //We can create properties in interfaces but these properties are final and can't be modified
    void applyBreak(int decrement);
    void speedUp(int increment);
}
interface blowHorn{
    void blowHorn_mein_hu_na();
    void bloHorn_dhoom();
}
class avonBicycle implements biCycle,blowHorn{
    void blowHorn(){
        System.out.println("PEEp PEEp");
    }
    public void applyBreak(int dercrement){
        System.out.println("Decreasing speed by");
    }
    public void speedUp(int increment){
        System.out.println("Increasing speed");
    }
    public void blowHorn_mein_hu_na(){
        System.out.println("Mein hu na");
    }
    public void bloHorn_dhoom(){
        System.out.println("Dhoom DHoom");
    }
    public void testFunction(){
        System.out.println("This is a test function");
    }

}

public class Interfaces {
    public static void main(String[] args) {
    avonBicycle a = new avonBicycle();
    a.applyBreak(65);
        System.out.println(a.a);

    }
}
