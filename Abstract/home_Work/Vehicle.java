package Abstract.home_Work;

abstract class Vehicle {
    String brand;
    int speed;
    Vehicle(String brand , int speed){
        this.brand = brand;
        setSpeed(speed);
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed <= 300) {
            this.speed = speed;
        }else{
            throw new IllegalArgumentException("Please Enter the Correct Speed under 300 !! ");
        }
    }
    void printInfo(){
        System.out.println("This Brand "+brand+"With that Speed "+speed);
    }
    abstract void drive();
}
class Car extends Vehicle {
    Car(String brand,int speed){
        super(brand,speed);
    }
    void drive(){
        System.out.println("Car is Driving Smoothly !! ");
    }
}
class Bike extends Vehicle{
    Bike(String brand,int speed){
        super(brand,speed);
    }
    void drive(){
        System.out.println("Driving Bike Smoothly !! ");
    }
    public static void main(String[] args){
        Car c = new Car("BMW",300);
        c.drive();
        c.printInfo();
        Bike b = new Bike("AUDI",250);
        b.drive();
        b.printInfo();
    }
}
