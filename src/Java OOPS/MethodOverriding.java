package com.company;
class A{
    int a;
    public void A(){
        System.out.println("This is a method A in Class A");
    }
    public void meth1(){
        System.out.println("This is method1");
    }
}
class B extends A{
    public void B(){
        System.out.println("This is method B in class B");
    }
    @Override
    public void meth1(){
        System.out.println("This is method1 in Class B");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        A a  = new A();
        a.meth1();
        B b = new B();
        b.meth1();
    }
}
