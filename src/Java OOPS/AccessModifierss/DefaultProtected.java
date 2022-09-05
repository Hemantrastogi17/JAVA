package com.company.AccessModifierss;

class Derived2 extends Base2{
    public void meth1(){
        System.out.println(a);
        System.out.println(d);
    }
}
public class DefaultProtected{
    public static void main(String[] args){
        Derived2 d = new Derived2();
        d.meth1();
    } 

}