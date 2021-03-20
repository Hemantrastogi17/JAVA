package com.company;

public class Constructors {
    //We make constructors when we want to accomplish a task every time an object is instantiated
    public Constructors(){
        System.out.println("Constructor with no argument");
    }
    public Constructors(int x){
        System.out.println("Constructor with one argument");
    }
    public Constructors(int x , int y){
        System.out.println("Constructors with 2 arguments");
    }
    public static void main(String[] args) {
        Constructors c = new Constructors();
        Constructors c1 = new Constructors(5);
        Constructors c2 = new Constructors(4,5);

    }
}
