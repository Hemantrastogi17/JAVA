package com.company;

import java.util.Scanner;

class Employee1{
    //  1.      Create a class Employee with the following properties and methods:
//        Salary (property) (int)
//        getSalary (method returning int)
//        name (property) (String)
//        getName (method returning String)
//        setName (method changing name)
    Scanner sc = new Scanner(System.in);
    private int salary;
    private String name;

    public void setSalary(){
        System.out.print("Enter your salary:");
        salary =  sc.nextInt();
    }
    public void setName(){
        System.out.print("Enter your name:");
        name = sc.nextLine();
    }
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
}
class CellPhone{
    public void ring(){
        System.out.println("Ringing...");
    }
    public void vibrate(){
        System.out.println("Vibrating...");
    }
}
public class PracticeSetBasicOOPS {
    public static void main(String[] args) {
//    Employee1 hemant = new Employee1();
//    hemant.setName();
//    hemant.setSalary();
//    System.out.println(hemant.getSalary());
//    System.out.println(hemant.getName());

        CellPhone p = new CellPhone();
        p.ring();
        p.vibrate();

    }
}
