package constructor.practice;

public class Car {
    String model;
    int mileage;
    Car(String model,int mileage){
        this.model = model;
        this.mileage = mileage;
    }
    void sendService(CarService s){
        s.service(this);
    }
}
class CarService{
    void service(Car c){
        System.out.println("Servicing car :"+c.model);
    }

    public static void main(String[] args) {
        Car c1 = new Car("Audi",12);
        CarService c2 = new CarService();
        c1.sendService(c2);

    }

}
