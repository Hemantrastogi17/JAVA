package com.company;
class Mytr1 extends Thread {
    public void run() {
        while (true) {
            System.out.println("This is Mytr1");
            try{
                Thread.sleep(455);
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
class MyTr2 extends Thread{
    public void run(){
        while(true){
            System.out.println("This is MyTr2");

        }
    }
}
public class ThreadMethods {
    public static void main(String[] args) {
     Mytr1 t1 = new Mytr1();
     MyTr2 t2 = new MyTr2();
     t1.start();
//     try{
//         t1.join();
//     }
//     catch (Exception e ){
//         System.out.println(e);
//     }
     t2.start();

    }
}
