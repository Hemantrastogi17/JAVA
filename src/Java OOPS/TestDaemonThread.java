package com.company;

class MyThread5 extends Thread  {

    public void run()  {

        if(Thread.currentThread().isDaemon()){//checking for daemon thread

            System.out.println("daemon thread work");

        }

        else{

            System.out.println("user thread1 work");

        }

    } }

class MyThread4 extends Thread  {

    public void run()  {

        System.out.println("user thread2 work");

    } }



class TestDaemonThread  {

    public static void main(String []args)   {

        MyThread5 t1=new MyThread5();

        MyThread4 t2=new MyThread4();

        t1.setDaemon(true);//now t1 is daemon thread

        t1.start();

        t2.start();

    }     }
