package Polymorphism.home_work;

public class Vehicle {
    void display(){
        System.out.println("Generic vehicle ");
    }
}
class Car extends Vehicle{
    void display(){
        System.out.println("Car : 4 wheels");
    }
}
class Bike extends Vehicle{
    void display(){
        System.out.println("Bike : 2 wheels");
    }
    public static void main(String[] args){
        Vehicle v = new Vehicle();
        v.display();
        Car c = new Car();
        c.display();
        Bike b = new Bike();
        b.display();
    }
}
