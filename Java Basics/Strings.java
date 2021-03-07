package com.company;

import java.util.Scanner;
public class Strings {
    public static void main(String[] args) {
        // String name = new String("Hemant");
        // String name = "Hemant";
        // System.out.print("The name is: ");
        // System.out.print(name);
        int a = 6;
        float b = 5.6454f;
        //System.out.printf("The value of a is %d and value of b is %8.2f", a, b);
        System.out.format("The value of a is %d and value of b is %f", a, b);
        Scanner sc = new Scanner(System.in);
//        String st = sc.next();
//        String st = sc.nextLine();
//        System.out.println(st);
        System.out.println();
        System.out.printf("%3$2s, %2$2s, %1$2s %n", "Tokyo", "London", "NewYork" );

    }
}
