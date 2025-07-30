package Abstract.practice;

abstract class shape {
    String name;
    shape(String name){
        this.name = name;
    }
    abstract double area();
    public String toString(){
        return "Name : "+name+" Area : "+area();
    }
}
class Circle extends shape{
    double radius;
    Circle(String name,double radius){
       super(name);
       this.radius = radius;
    }
    double area(){
        return Math.PI * radius * radius;
    }
}
class Rectangle extends shape{
    double height;
    double width;

    Rectangle(String name,double height,double width){
        super(name);
        this.height = height;
        this.width = width;
    }
    double area(){
        return height * width;
    }
    public static void main(String[] args){
        Circle c = new Circle("Circle Radius",3);
        c.area();
        System.out.println(c.toString());
    }
}