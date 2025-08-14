package Java_Oops.practice_for_test;

public interface Shape {
    double are();
    double perimeter();

}
class Circle implements Shape{
    double radius;
    Circle(double radius){
        this.radius = radius;
    }
    public double are(){
        return Math.PI * radius *  radius;
    }
    public double perimeter(){
        return 2 * radius * radius;
    }
    public static void main(String[] args){
        Circle c = new Circle(5);
        c.are();
    }
}
