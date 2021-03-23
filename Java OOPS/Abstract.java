package com.company;
abstract class Parent{
    Parent(){
        System.out.println("Parent class constructor invoked");
    }
    public void greet(){
        System.out.println("Hello");
    }
    abstract void sayHello();
    abstract void sayHello2();
}
class Child extends Parent{
    @Override
    void sayHello() {
        System.out.println("Hello from Child class");
    }
    @Override
    void sayHello2() {
        System.out.println("Hello2 from Child class");
    }
}

//A class containing an abstract method is called abstract class
//Any class that extends an abstract class and has the definition of all the abstract methods defined in parent class is called concrete class
//We can't create objects for an abstract class but we can create reference of an abstract class and use dynamic method dispatch
// We can create objects only for concrete class
// An abstract class can be used to derive a concrete class(by defining all the methods in derived class)
//or can be used to derive another abstract class(by defining some or no methods of parent class)

public class Abstract {
    public static void main(String[] args) {

    }
}
