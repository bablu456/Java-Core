package Polymorphism.practice;

public class shape {
    void draw(){
        System.out.println("Drawing ");
    }
}
class circle extends shape{
    void draw(){
        System.out.println("Drawing Circle");
    }
    void draw(int radius){
        System.out.println("Drawing Circle of Radius : "+radius*radius*3.143);
    }
}
class  rectangle extends shape{
    void draw(){
        System.out.println("Drawing Rectangle ");
    }
    public static void main(String[] args){
        circle c = new circle();
        c.draw();
        c.draw(5);
        rectangle r = new rectangle();
        r.draw();
    }
}
