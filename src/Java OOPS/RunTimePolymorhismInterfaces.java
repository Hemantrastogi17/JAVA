package com.company;
interface Camera1{
    public void  takeSnap();
    public void recordVideo();
}
interface Wifi1{
    public String[] getNetworks();
    public void connectToNetwork(String net);
}
class MySmartPhone1 implements Camera1, Wifi1{
    @Override
    public void takeSnap() {
        System.out.println("Taking Snap");
    }

    @Override
    public void recordVideo() {
        System.out.println("Recording Video");
    }

    @Override
    public void connectToNetwork(String networks) {
        System.out.println("Connecting to network"+networks);
    }

    @Override
    public String[] getNetworks() {
        String[] networks = {"Hemant", "Firefist", "Caretaker"};
        return networks;
    }
}
public class RunTimePolymorhismInterfaces {
    public static void main(String[] args) {

        //Polymorphism in Interfaces
        //This is used when we want to implement an interface and force the method implementation
        Camera1 c = new MySmartPhone1(); //This is a smartphone but use it as a Camera only.
        c.takeSnap();
        c.recordVideo();
        //The reference of Camera1 interface will be able to access only the methods defines in Camera Interface
//        c.getNetworks();  -> Throws an error
        MySmartPhone1 p = new MySmartPhone1();
        p.getNetworks();
       p.connectToNetwork("Hemant");
        p.takeSnap();
        p.recordVideo();

    }
}
