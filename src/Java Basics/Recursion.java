package com.company;

import java.util.Scanner;

public class Recursion {
    static int factorial(int x){
    if(x ==0 || x ==1){
        return 1;
    }
    else {
        return (x*factorial(x-1));
    }
    }
    static int factorial_iterative(int x){
        if(x ==0 || x ==1){
            return 1;
        }
        else{
            int pro =1;
            for (int i = 1; i <=x ; i++) {
                pro*=i;
            }
            return pro;
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter a  number to calculate factorial:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("The factorial of x is:"+factorial(num));
        System.out.println("The factorial of x is:"+factorial_iterative(num));


    }
}
