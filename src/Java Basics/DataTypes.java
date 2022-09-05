package com.company;

import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        //Program to add two numbers:
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = sc.nextInt();
        System.out.println("Enter a number");
        int y = sc. nextInt();
        int z = x+y;
        System.out.println("Sum is:"+ z);



        // Program to calculate percentage of a CBSE students using marks of 5 subjects

        int [] marks = new int[5];
        int sum = 0;
        for (int i = 0; i <marks.length ; i++) {
            System.out.println("Enter marks of subject"+i+1);
            marks[i] = sc.nextInt();
            sum+=marks[i];
        }
        int per = sum/5;
        System.out.println("Percentage is:"+per+"%");
    }
}
