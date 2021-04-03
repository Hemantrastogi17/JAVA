package com.company;

class MyThread3 extends Thread  {

    public void run()  {

        System.out.println("Thread is running");

    }  }

class SetThreadPriority   {

    public static void main(String [] args)   {

        MyThread3 t1=new MyThread3();//by default priority is 5

        MyThread3 t2=new MyThread3();//by default priority is 5

        MyThread3 t3=new MyThread3();//by default priority is 5

        t1.setPriority(Thread.MIN_PRIORITY);//1

        t2.setPriority(Thread.MAX_PRIORITY);//10

//        t1.setPriority(1);
//
//        t2.setPriority(10);

        System.out.println("Priority Value of t1 thread="+t1.getPriority());

        System.out.println("Priority Value of t2 thread="+t2.getPriority());

        System.out.println("Priority Value of t3 thread="+t3.getPriority());

        t1.start();

        t2.start();

        t3.start();

    }
}


