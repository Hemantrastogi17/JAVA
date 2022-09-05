package com.company;
interface Parent1{
    public void meth1();
    public void meth2();
}
interface Child1 extends Parent1{
    public void meth3();
    public void meth4();
}
class SampleClass implements Child1{
    @Override
    public void meth1(){
        System.out.println("This is method 1");
    }
    @Override
    public void meth2(){
        System.out.println("This is method 2");
    }
    @Override
    public void meth3(){
        System.out.println("This is method 3");
    }
    @Override
    public void meth4(){
        System.out.println("This is method 4");
    }
}
public class InheritanceInterfaces {
    public static void main(String[] args) {
        SampleClass c = new SampleClass();
        c.meth1();
        c.meth2();
        c.meth3();
        c.meth4();
    }
}
