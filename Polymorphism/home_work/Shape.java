package Polymorphism.home_work;

public class Shape {
    void draw(){
        System.out.println("Drawing Shape");
    }
}
class Circle extends Shape{
    void draw(){
        System.out.println("Drawing Circle ");
    }
    void draw(int radius){
        System.out.println("Drawing Circle of radius : "+(3.143*radius*radius));
    }
}
class Rectangle extends Shape{
    void draw(){
        System.out.println("Drawing Rectangle ");
    }
    public static void main(String[] args){
        Circle c = new Circle();
        c.draw();
        c.draw(5);
        Shape s = new Shape();
        s.draw();
        Rectangle r = new Rectangle();
        r.draw();
    }
}