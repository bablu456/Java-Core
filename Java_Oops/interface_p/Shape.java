package Java_Oops.interface_p;

import org.w3c.dom.css.Rect;

public interface Shape {
    double area();
    double perimeter();
}
class Circle implements Shape{
    double radius;
    Circle(double radius){
        this.radius = radius;
    }
    public double area(){
        return Math.PI * radius * radius;
    }
    public double perimeter(){
        return radius  * radius;
    }
}
class Rectangle implements Shape{
    double width;
    double height;
    Rectangle(double width,double height){
        this.height = height;
        this.width = width;
    }
    public double area(){
        return  height * width;
    }
    public double perimeter(){
        return 2 * height * width;
    }
    public static void main(String[] args){
        Circle c = new Circle(5);
        System.out.print(c.area());
        c.perimeter();

    }
}
