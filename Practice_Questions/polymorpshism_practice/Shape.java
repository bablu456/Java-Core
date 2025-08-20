package Practice_Questions.polymorpshism_practice;

public class Shape {
    void draw(){
        System.out.println("Drawing Shape ");
    }
}
class Circle extends Shape{
    void draw(){
        System.out.println("Drawing Circle ");
    }
    void draw(int radius){
        System.out.println("Drawing Circle Of Radius : "+radius*radius);
    }
    public static void main(String[] args){
        Shape s = new Shape();
        s.draw();
        Circle c = new Circle();
        c.draw();
        c.draw(5);

    }
}
