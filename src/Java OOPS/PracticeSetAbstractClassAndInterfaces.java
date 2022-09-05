package com.company;

abstract class Pen{
    abstract public void write();
    abstract public void refill();
}
class FountainPen extends Pen{
    @Override
    public void write(){
        System.out.println("Writing with fountain pen");
    }
    @Override
    public void refill(){
        System.out.println("Refilling Fountain Pen");
    }
    public void changeNib() {
        System.out.println("Changing the nib");
    }

}
interface BasicAnimal{
    public void eat();
    public void sleep();
}
class Monkey{
    public void jump(){
        System.out.println("Jumping");
    }
    public void bite(){
        System.out.println("Biting");
    }
}
class Human extends Monkey implements BasicAnimal{
    public void eat(){
        System.out.println("Human is eating");
    }
    public void sleep(){
        System.out.println("Human is sleeping");
    }
}
public class PracticeSetAbstractClassAndInterfaces {
    public static void main(String[] args) {


//     1.   Create an abstract class pen with methods write () and refill () as abstract methods
//     2.   Use the pen class from Q1 to create a concrete class fountain pen with additional method change Nib ()

        FountainPen pen = new FountainPen();
        pen.changeNib();
//3. Create a class monkey with jump ( ) and bite ( ) methods Create a class human whichinherits this monkey class and implements basicanimal interface with eat ( ) and sleep methods
        Human Firefist = new Human();
        Firefist.sleep();

        Monkey m1 = new Human();
        m1.jump();
        m1.bite();
        // m1.speak(); --> Cannot use speak method because the reference is monkey which does not have speak method
//4.Demonstrate polymorphism using using monkey  class from Q3
                BasicAnimal Hemant = new Human();
        // Hemant.speak(); --> error
        Hemant.eat();
        Hemant.sleep();
    }
}
