package com.company;

import java.util.Scanner;

public class IfElsePracticeSet {
    public static void main(String[] args) {
//        int a = 10;
//        if (a=11)
//            System.out.println(“I am 11”);
//        else
//            System.out.println(“I am not 11”);


        //Write a program to find out whether a student is pass or fail; if it requires total 40% and at least 33% in each subject to pass. Assume 3 subjects and take marks as an input from the user.

        /*Scanner sc = new Scanner(System.in);
        float [] marks = new float[3];
        float sum = 0;
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter marks of subject"+(i+1)+"(out of 100)");
            marks[i] = sc.nextFloat();
            sum+=marks[i];
        }
        if(sum <120 || marks[0]<33 || marks[1]<33 || marks[2] <33){
            System.out.println("Student is fail");
        }
        else{
            System.out.println("Student is pass");
        }*/


//        Calculate income tax paid by an employee to the government as per the slabs mentioned below:
//                Income Slab	        Tax
//                2.5L – 5.0L  	        5%
//                5.0L – 10.0L 	        20%
//                Above 10.0L	        30%
//                Note that there is not tax below 2.5L. Take the input amount as input from the user.

        System.out.println("Enter your income(in lakhs):");
        Scanner sc = new Scanner(System.in);
        float income = sc.nextFloat();
        float tax = 0;
        if(income<=2.5){
            tax = tax + 0;
        }
        else if(income>2.5f && income <= 5f){
            tax = tax + 0.05f * (income - 2.5f);
        }
        else if(income>5f && income <= 10.0f){
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (income - 5f);
        }
        else if(income>10.0f){
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (10.0f - 5f);
            tax = tax + 0.3f * (income - 10.0f);
        }
        System.out.println("Tax is:"+tax+"(in lakhs)");
    }
}
