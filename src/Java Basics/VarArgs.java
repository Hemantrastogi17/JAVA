package com.company;

public class VarArgs {
    //This function can take zero to any number of arguments
    static int sum(int ...arr){
        int result = 0;
        for (int ele:
             arr) {
            result+=ele;
        }
        return result;
    }
    //this function requires minimum one argument
    static int sum1(int elem,int ...arr){
        int result = 0;
        for (int ele:
                arr) {
            result+=ele;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(sum());
        System.out.println(sum(1));
        System.out.println(sum(1,2));
        System.out.println(sum(1,2,3));
    }
}
