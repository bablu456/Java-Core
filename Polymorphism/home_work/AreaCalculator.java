package Polymorphism.home_work;

import org.w3c.dom.ls.LSOutput;

public class AreaCalculator {
    double area(double radius) {
        return 3.143 * radius * radius;
    }

    double area(int length, int breath) {
        return length * breath;
    }

    double area(double base, double height) {
        return base * height;
    }

    public static void main(String[] args) {


        AreaCalculator a = new AreaCalculator();
        double area_of_circle = a.area(12);
        double area_of_rectangle = a.area(5, 5);
        double area_of_triangle = a.area(12.5, 12.5);
        System.out.println("Area Of Circle : " + area_of_circle);
        System.out.println("Area of Rectangle : " + area_of_rectangle);
        System.out.println("Area of Triangle : " + area_of_triangle);
    }
}

