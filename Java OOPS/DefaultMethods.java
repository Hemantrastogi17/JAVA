package com.company;


interface Camera{
    public void takeSnap();
    public void recordVideo();
    //Private methods inside interfaces work only in Java 9 and onwards
    //methods defined inside interface are public by default
    //variables defined inside interfaces are final by default
//    private void greet(){
//        System.out.println("Good Morning");
//    }
    default void recordHDVideo(){
//        greet();
        System.out.println("Recording HD Video");
    }
}
interface Wifi{
    public String[] getNetworks();
    public void connectToNetworks(String[] network);
}
class MyCellPhone{
    void call(){
        System.out.println("Calling...");
    }
    void answerCall(){
        System.out.println("Answering Call...");
    }
}
class MySmartPhone extends MyCellPhone implements Camera, Wifi{
    @Override
    public void takeSnap(){
        System.out.println("Taking Snap");
    }
    @Override
    public void recordVideo(){
        System.out.println("Recording Video");
    }
    @Override
    public String[] getNetworks(){
        String[] network = {"Hemant","Firefist", "Caretaker"};
        return network;
    }
    @Override
    public void connectToNetworks(String[] network) {
        System.out.println("Connect to :"+ network[0] );
    }
}
public class DefaultMethods {
    public static void main(String[] args) {
        MySmartPhone p = new MySmartPhone();
        p.takeSnap();
        p.recordVideo();
    }
}
