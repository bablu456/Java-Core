package Encapsulation.practice_Questions;

public class Car {
    private String make;
    private String model;
    private int year;
    private int milege;
    private double  fuelLevel;

    Car(String make,String model,int year){
        this.make = make;
        this.model = model;
        this.year = year;
        this.milege = 0;
        this.fuelLevel = 0;
    }
    String getMake(){
        return make;
    }
    String getModel(){
        return make;
    }
    int getYear (){
        return year;
    }
    int getMilege(){
        return milege;
    }
    void addFuel(double gallons){
        if(fuelLevel >= 15){
            return;
        }else{
            fuelLevel = gallons;
        }
    }
    void drive(int miles){
        fuelLevel -= (miles/25);
    }
    double getFuelLevel(){
        return fuelLevel;
    }
    boolean canDrive(int miles){
        if(miles<=0){
            System.out.print("Miles is 0 we can't drive please add valid number ");
        }
        int fuelneed = miles / 25;
        return fuelLevel >= fuelneed;
    }
    public static void main(String[] args){
        Car c = new Car("yes","porshe",2003);
        c.addFuel(10);
        c.drive(150);
        System.out.println("Driving : "+c.getFuelLevel());
        System.out.print("Can Drive : "+c.canDrive(100));
    }
}
