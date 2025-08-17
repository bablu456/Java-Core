package Home_Work.inheritance;

public class Shape {
    int lenght = 5;
    int breadth = 5;
    void area(){
        System.out.println("the area is : "+(lenght*breadth));
    }
}
class Rectangle extends Shape{
    void area(){
        super.area();
        super.lenght = 10;
        super.breadth = 10;
        System.out.println("the area is : "+(lenght*breadth));
    }
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.area();
    }
}
