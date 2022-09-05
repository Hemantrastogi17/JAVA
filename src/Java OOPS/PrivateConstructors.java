package com.company;

//public class PrivateConstructors {
//    private PrivateConstructors(){
//        System.out.println("This is a private Constructor");
//    }
//    public static void createInstance(){
//        PrivateConstructors pc = new PrivateConstructors();
//    }
//    public static void main(String[] args) {
//        PrivateConstructors.createInstance();
//
//    }
//}

//Creating a singleton class using private constructor
public class PrivateConstructors{
    //Create a public static variable of class type to store object in createInstance() method
    private static PrivateConstructors pcons;
    private PrivateConstructors(){
        System.out.println("Inside Private Constructor");
    }
    public static PrivateConstructors  createInstance(){
        if(pcons== null){
            pcons = new PrivateConstructors();
        }
        return pcons;
    }
    public void  display(){
        System.out.println("Display method invoked");
    }
    public static void main(String[] args) {
       // PrivateConstructors.createInstance();
        PrivateConstructors pcon;
        pcon = PrivateConstructors.createInstance();
        pcon.display();
    }
}
//Since the constructor is private, we cannot create objects of PrivateConstructors from the outer class. Hence, we have created an object of the class inside the createInstance() method.
//However, we have set the condition in such a way that only one object is created. And, the method returns the object.
//Since, createInstance() returns the object of the PrivateConstructors class, the pcon variable is assigned with the returned object.
//        Finally, we have called the display() method using the object.