package Polymorphism.practice;


public class vehicle {
    void display(){
        System.out.println("Generic Vehincle ");
    }
}
class car extends vehicle{
    void display(){
        System.out.println("Car : 4 wheels ");
    }
}
class Bike extends vehicle{
    void display(){
        System.out.println("Bike: 2 Wheels ");
    }
    public static void main(String[] args){
        car c = new car();
        c.display();
        Bike b = new Bike();
        b.display();
    }
}
