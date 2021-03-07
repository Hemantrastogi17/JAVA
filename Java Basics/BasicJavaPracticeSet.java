package com.company;

import java.util.Scanner;

public class BasicJavaPracticeSet {
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

            int [] marks = new int[3];
            int sum = 0;
            for (int i = 0; i <marks.length ; i++) {
                System.out.println("Enter marks of subject"+(i+1));
                marks[i] = sc.nextInt();
                sum+=marks[i];
            }
            int per = sum/30;
            System.out.println("CGPA is:"+per);


            //Program to greet user
            System.out.println("Enter your name:");
            String str = sc.nextLine();
            System.out.println("Have a nice day"+str);


            //Check whether a number entered by a user is an integer or not
            System.out.println("Enter a number:");
            boolean s = sc.hasNextInt();
            if(s) System.out.println("The entered number is an integer.");
            else{
                System.out.println("The entered number is not an integer");
            }
        }
}
