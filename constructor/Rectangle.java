package constructor;

public class Rectangle {
    double length;
    double breadth;

    Rectangle(double length,double breadth){
        this.length = length;
        this.breadth = breadth;
    }
    public boolean compare(Rectangle r1){
     double area1 = this.breadth * this.length;
     double are2 = r1.length * r1.breadth;
     return  are2 == area1;

    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10,20);
        Rectangle r2 = new Rectangle(10,20);
        boolean isEqual = r1.compare(r2);
        System.out.println("Rectangle 1 and 2 have equal area : "+isEqual);
    }

}
