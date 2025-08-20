package Practice_Questions.polymorpshism_practice;

public class Vehicle {
    void displayInfo(){
        System.out.println("Generic Vehicle !! ");
    }
}
class car extends Vehicle{
    void displayInfo(){
        System.out.println("Car : 4 Wheels");
    }
}
class Bike extends Vehicle{
    void displayInfo(){
        System.out.println("Bike : 2 Wheels ");
    }
    public static void main(){
        Vehicle v = new Vehicle();
        v.displayInfo();
        car c = new car();
        c.displayInfo();
        Bike b = new Bike();
        b.displayInfo();
    }
}
