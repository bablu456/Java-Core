package Inheritance.extra_practice;

public class Box {
    double l;
    double w;
    double h;

    Box(){
        this.h = -1;
        this.l = -1;
        this.w = 0;
    }
    Box(double d){
        this.h = d;
        this.w = d;
        this.l = d;
    }

    Box(double w, double h, double l) {
        this.w = w;
        this.h = h;
        this.l = l;
    }
    Box(Box old){
        this.h = old.h;
        System.out.println("hello");
    }
    public static void main(String[] args){
        Box b = new Box(5.5);
        System.out.println("hello "+b.h);
        Box g = new Box(b);
        System.out.println(g.h);

    }
}
