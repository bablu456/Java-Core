package Practice_Questions.polymorpshism_practice;

public class AreaCalculator {
    double area(int radius){
        return 3.143*radius*radius;
    }
    double area(int lenght,int breath){
        return lenght * breath;
    }
    double area(double base,double height){
        return base*height;
    }
    public static void main(String[] args){
        AreaCalculator a = new AreaCalculator();
        double store1 = a.area(5);
        double store2 = a.area(5,5);
        double store3 = a.area(12.5,12.5);
        System.out.println("Area of Rectagle : "+store1);
        System.out.println("Area of Rectangle : "+store2);
        System.out.println("Area of Triangle : "+store3);
    }
}
