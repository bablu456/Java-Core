package Java_Oops.practice_for_test;

public interface Vehicle {
    void start();
    void stop();
    String fueltype();
}
class car implements Vehicle{
    public void start(){
        System.out.println("Car Started !! ");
    }
    public void stop(){
        System.out.println("car Stoped !! ");
    }
   public String fueltype(){
        return "petrol";
    }
    public static void main(String[] args){
        car c = new car();
        c.start();
        c.stop();
        System.out.println(c.fueltype());
    }
}

