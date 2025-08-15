package Encapsulation.practice_Questions;

public class Circle {
    private double radius;
        Circle(double radius){
        this.radius  = radius;
        }
        public void setRadius(double r){
            radius = r;
        }
        public double getRadius(){
            return radius;
        }
      public  double getArea(){
            return 3.143 * radius * radius;
      }
      public double getCircumference(){
            return 2 * 3.143 * radius * radius;
      }
        public static void main(String[] args){
            Circle c = new Circle(5);
            double radius = c.getRadius();
            System.out.println(radius);
            System.out.println(c.getArea());
            System.out.println(c.getCircumference());
        }
}
