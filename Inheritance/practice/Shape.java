package Inheritance.practice;

import org.w3c.dom.css.Rect;

public class Shape {
    void area(){
        System.out.println("Calculating Area ....");
    }
}
class Rectangle extends Shape{
    int length = 5;
    int breath = 5;
    void area(){
        System.out.println("Area of Rectangle is : "+length*breath);
    }
    public static void main(String[] args){
        Rectangle r = new Rectangle();
        r.area();
    }
}
