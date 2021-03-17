package com.company;

public class PracticeSetFunctions {
    static void MultiplicationTable(int x){
        for (int i = 0; i < 10; i++) {
            System.out.println(x+"*"+(i+1)+"="+x*(i+1));
        }
    }
    static void printStar1(){
        for (int i =1 ; i <=4 ; i++) {
            for (int j = 1; j <= 4; j++) {
                if(j>=5-i){
                    System.out.print("x");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
    static int SumOfNaturalNumbers(int x){
        if(x == 0){
            return 0;
        }
        else{
            return (x+SumOfNaturalNumbers(x-1));
            }
    }
    static void printStar2(){
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                if (j>=i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
    static void printStar3(){
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                if (j<=5-i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
    static int Fibonacci(int n){
        if(n ==0){
            return 0;
        }
        else if(n == 1 || n ==2){
            return 1;
        }
        else{
            return Fibonacci(n-1)+Fibonacci(n-2);
        }
    }
    static void printStar1_rec(int n){
        if(n>0){
            printStar1_rec(n-1);
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        //MultiplicationTable(5);
        //printStar1();
        //System.out.println(SumOfNaturalNumbers(15));
        //printStar2();
        //printStar3();
        //System.out.println(Fibonacci(6));
        printStar1_rec(5);
    }
}
