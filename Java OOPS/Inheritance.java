package com.company;
class Base{
    private int x;
    public void setX(int X){
        this.x = X;
    }
    public int getX(){
        return x;
    }
}
public class Inheritance extends Base{
    int y;
    public void setY(int Y){
        this.y = Y;
    }
    public int getY(){
        return y;
    }
    public static void main(String[] args) {
        Inheritance i = new Inheritance();
        i.setY(5);
        System.out.println(i.getY());

        Base b = new Base();
        b.setX(5);
        System.out.println(b.getX());
    }
}
