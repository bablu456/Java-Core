package Polymorphism.home_work;

public class Shape_Size {
    void print(){
        System.out.println("This is Shape ");
    }
}
class Square extends Shape_Size{
    void print(){
        System.out.println("This is a Square ");
    }
}
class Trinagle extends Shape_Size{
    void print(){
        System.out.println("This is a triangle ");
    }
    public static void main(String[] args){
        Shape_Size s = new Shape_Size();
        s.print();
        Square ss = new Square();
        ss.print();
        Trinagle t = new Trinagle();
        t.print();
    }
}
