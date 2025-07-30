package Abstract;

abstract class Vehicle {
    String brand;
    Vehicle(String brand){
        this.brand = brand;
    }
    abstract void start();

    void display(){
        System.out.println("Brand : "+brand);
    }
}
class Car extends Vehicle{
    Car(String brand){
        super(brand);
    }
    @Override
    void start(){
        System.out.println("Car Is starting with key....");
    }
}
class Main{

    public static void main(String[] args){
    Car myCar = new Car("Toyato");
    myCar.start();
    myCar.display();
    }
}
