package com.company;
class Base1{
      String className = "Base1";
    public Base1(){
        System.out.println("Inside Base1 class constructor");
    }
    public Base1(int x){
        System.out.println("Inside Base Class Constructor with 1 argument");
    }
    public void Base1(){
        System.out.println("Inside Base1 Method in Base1 Class");
    }
}
class Derived1 extends Base1{
    public String className = "Derived1";
    Derived1(){
        super(5);
        System.out.println("Inside Derived1  class Constructor");
        System.out.println(super.className);
        super.Base1();
    }

}
public class InheritanceInConstructors extends Base1{
    public static void main(String[] args) {
        Derived1 d = new Derived1();

    }
}
