package Encapsulation.practice_Questions;


public class Rectangle {
    private double length;
    private double width;
    Rectangle(double length,double width){
        this.length = length;
        this.width = width;
    }
    public void setLength(double s){
        length = s;
    }
    double getLength(){
        return length;
    }
    public void setWidth(double g){
        width = g;
    }
    double gtePerimeter(){
        return length * width;
    }
    boolean isSquare(){
        if(length == width){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args){
        Rectangle r  = new Rectangle(4,6);
        System.out.println();
    }
}
