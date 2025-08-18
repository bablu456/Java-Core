package Practice_For_Test.encapsulation;

import org.w3c.dom.css.Rect;

public class Rectangle {
    private double length;
    private double width;
    Rectangle(double length,double width){
        this.length = length;
        this.width = width;
    }
    void setLength(double length){
        this.length = length;
    }
    void setWidth(double width){
        this.width = width;
    }
    double getArea(){
        return length * width;
    }
    double getPerimeter()
    {
        return length * width * 2;
    }
    boolean isSquare(){
        return length == width;
    }
    public static void main(String[] args){
        Rectangle r = new Rectangle(4,6);
        System.out.println(r.getArea());
        System.out.println(r.isSquare());
    }
}
