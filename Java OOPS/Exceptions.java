package com.company;

import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        int[] arr = new int[3];
        Scanner sc = new Scanner(System.in);
        arr[0]=3;
        arr[1]=4;
        arr[2]=5;
        System.out.println("Enter the array index:");
        int ind = sc.nextInt();
        System.out.println("Enter the number by which you want to divide:");
        int num = sc.nextInt();
        try{
            System.out.println("The number at the entered index is:"+arr[ind]);
            System.out.println("Result after division by number is:"+arr[ind/num]);
        }
        catch(ArithmeticException e){
            System.out.println("ArithmeticException occured");
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occured");
            System.out.println(e);
        }
        catch(Exception e ){
            System.out.println(e);
        }
        }
    }

