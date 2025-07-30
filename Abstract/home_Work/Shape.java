package Abstract.home_Work;
import java.util.*;
abstract class Shape {

    String name;
    Shape(String name){
        this.name = name;
    }
    public String toString(){
        return "Name : "+name+"\nShape : "+area();
    }
    abstract double area();
}
class circle extends Shape{
    double radius;

    circle(double radius){
        super("Circle");
        this.radius = radius;
    }
    double area(){
        return Math.PI * radius * radius;
    }
}
class Rectangle extends Shape{
    double height,width;

    Rectangle(double height,double width){
        super("Rectangle");
        this.height = height;
        this.width = width;
    }
    double area(){
        return height * width;
    }
    public static void main(String[] args){
        circle ci = new circle(3);
        System.out.println(ci.toString());
        System.out.println(ci.area());
    }
}