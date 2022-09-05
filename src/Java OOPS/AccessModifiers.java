package com.company;
class C1{
    public  int a =45 ;
    protected int b =96;
    int c = 84;
    private int d = 47;

    String meth1(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        return "Hello";
    }
}

public class AccessModifiers {
    protected int f = 10;
    int s= 11;
    public static void main(String[] args) {

    C1 c = new C1();

        System.out.println(c.meth1());
        System.out.println(c.a);
        System.out.println(c.b);
        System.out.println(c.c);
//        System.out.println(c.d);



    }
}
