package com.company;

import java.util.Random;
import java.util.Scanner;

class Game{
    private int noOfGuesses=0;
    public boolean match;
    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }
    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public int random(){
        Random rn = new Random();
        int rand = rn.nextInt(100);
        return rand;
    }
    public  int takeUserInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number from 0-100");
        int input = sc.nextInt();
        return input;
    }
    public  boolean isCorrectNumber(int input , int rand){
       // boolean match=false;
        if(input == rand){
            System.out.println("Guessed the correct number");
            System.out.println("Number of guesses:"+getNoOfGuesses());
            this.match=true;
        }
        else if(input< rand){
            System.out.println("The entered number is too low.");
            this.match =false;
            noOfGuesses++;
            setNoOfGuesses(noOfGuesses);
        }
        else if(input> rand){
            System.out.println("The entered number is too high");
            this.match =false;
            noOfGuesses++;
            setNoOfGuesses(noOfGuesses);
        }
        return match;
    }
}
public class GuessTheNumber {
    public static void main(String[] args) {

        Game g = new Game();
        int rand= g.random();
        while(!g.match) {
             int input = g.takeUserInput();
            g.isCorrectNumber(input,rand);
        }
    }
}
