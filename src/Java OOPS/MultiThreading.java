package com.company;
class MyThread1 extends Thread{
    public void run(){
      //  int i =0;
        while (true){
            System.out.println("This is Thread1");

        }
    }
}
class MyThread2 extends Thread{
    public void run(){
       // int i= 0;
        while(true){
            System.out.println("This is Thread2");
           // i++;
        }
    }
}
public class MultiThreading {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
    }
}
