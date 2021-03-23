package com.company;
class Phone{
    public void switchOn(){
        System.out.println("Switching on Smart Phone");
    }
    public void showTime(){
        System.out.println("Time is 2:00 p.m.");
    }
}
class SmartPhone extends Phone{
    @Override
    public void switchOn(){
        System.out.println("Switching On Smart Phone");
    }
    public void Music(){
        System.out.println("Playing music");
    }
}
public class DynamicMethodDispatch{
    public static void main(String[] args) {
//        Phone obj1 = new Phone();     //Allowed
//        SmartPhone obj1 = new SmartPhone();   /Allowed
        Phone obj = new SmartPhone();
        //Super class ka reference = Child Class ka Object
//        SmartPhone obj = new Phone() //Not Allowed
        obj.showTime();
        obj.switchOn();
        //obj.Music(); //Not Allowed
    }
}
