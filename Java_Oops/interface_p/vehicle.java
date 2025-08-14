package Java_Oops.interface_p;

public interface vehicle {
    void start();
    void stop();
    String fuelType();

}
class Car implements vehicle{
   public void start(){
        System.out.println("Car is Started !! ");
    }
   public void stop(){
        System.out.println("Car has been Stopped !! ");
    }
   public String fuelType(){
       return "Petrol";
   }
}
class Bike implements vehicle {
    public void start(){
        System.out.println("Bike is Started !! ");
    }
    public void stop(){
        System.out.println("Bike has been Stopped ");
    }
    public String fuelType(){
        return "petrol";
    }
    public static void main(String[] args){
        Car c = new Car();
        c.start();
    }
}
