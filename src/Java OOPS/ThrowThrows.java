package com.company;

//import javafx.concurrent.ScheduledService;

import java.util.Scanner;
class NegativeRadiusException extends Exception{
    @Override
    public String toString(){
        return "Radius can't be negative\n";
    }
    @Override
    public String getMessage(){
        return "Exception found. Argument passed can't be less than zero";
    }
}
public class ThrowThrows {
    static double calArea(float r) throws NegativeRadiusException{

        if(r<0){
            throw new NegativeRadiusException();
        }
        else{
            double area = Math.PI*r*r;
            return area;
        }
    }

    public static void main(String[] args) {
        try{
            double Area = ThrowThrows.calArea(-10.0f);
            System.out.println(Area);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
