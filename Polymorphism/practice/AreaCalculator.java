package Polymorphism.practice;

public class AreaCalculator {
    double Area(int radius){
        return 3.143*radius*radius;
    }
    double Area(int length,int breath){
        return length*breath;
    }
    double Area(double base,double height){
        return base * height;
    }
    public static void main(String[] args){
        AreaCalculator a = new AreaCalculator();
        double circle = a.Area(12);
        double rectangle = a.Area(10,10);
        double Triangle = a.Area(12.5,5);
        System.out.println("Area of Circle : "+circle);
        System.out.println("Area of Rectangle : "+rectangle);
        System.out.println("Area of Triangle : "+Triangle);
    }
}
