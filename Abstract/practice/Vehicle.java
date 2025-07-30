package Abstract.practice;

import Encapsulation.practice_Questions.Car;

abstract class Vehicle {
    String brand;
    int speed;
    abstract void drive();

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if(speed>=0 && speed<=300) {
            this.speed = speed;
        }else{
            System.out.println("please enter the speed again !! ");
        }
    }

    Vehicle(String brand, int speed){
        this.brand = brand;
       setSpeed(speed);
    }
}
class car extends Vehicle{
    car(String brand,int speed){
        super(brand,speed);
    }
    void drive(){
        System.out.println("I'm Driving "+brand+" Car with Speed : "+speed);
    }
public static void main(String[] arga)
{
    car c = new car("audi",120);
}
}
