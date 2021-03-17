package com.company;

import java.util.Scanner;

 class Employee{
    Scanner sc = new Scanner(System.in);
    int id;
    String name;

    void setDetails(){
        System.out.println("Enter your name:");
        this.name = sc.nextLine();
        System.out.println("Enter your id:");
        this.id = sc.nextInt();

    }
    void getDetails(){
        System.out.println("Your id :"+id);
        System.out.println("Your name:"+name);
    }


}
public class FirstClass {
    public static void main(String[] args) {
    Employee Hemant = new Employee();
    //Hemant.getDetails();
    Hemant.setDetails();
    Hemant.getDetails();

    }
}
