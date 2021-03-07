package com.company;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Get String as input;
//        System.out.println("Enter a string");
//        String str = sc.next();
//        System.out.println(str);

        //Get a sentence as input
        System.out.println("Enter a sentence");
        String str1 = sc.nextLine();
        System.out.println(str1);

        System.out.println("Enter a number");
        int x = sc.nextInt();
        System.out.println(x);
        System.out.println("Enter a number");
        boolean y = sc.hasNextInt();  //Checks if y gets a float value or not and returns true or false accordingly
        System.out.println(y);



        //convert a string into integer;
        System.out.println("Enter a number");
        String str2 = sc.next();
        int z = Integer.parseInt(str2);
        System.out.println(z);
    }
}
