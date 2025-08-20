package Practice_Questions.polymorpshism_practice;

public class shape1 {
    void printShape(){
        System.out.println("This is a Shape");
    }
}
class Square extends shape1{
    void printShape(){
        System.out.println("This is Square Shape !! ");
    }
}
class Triangle extends shape1{
    void printShape(){
        System.out.println("This si a Triangle Shape !1 ");
    }
    public static void main(String[] args){
        shape1 s = new shape1();
        s.printShape();
        Square ss = new Square();
        ss.printShape();
        Triangle t = new Triangle();
        t.printShape();

    }
}
