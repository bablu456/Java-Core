package Home_Work;
import java.util.Scanner;
public class car {
    String brand;
    String model;
    int year;
    double fuel;
    void drive(double distance){
        fuel = fuel - distance;
        System.out.println("The rest fuel is : " + fuel);
    }
    void refuel(double litres){
        fuel = fuel + litres;
        System.out.println("After adding some fuel is : "+ fuel);
    }
    void display(){
        System.out.println("Brand name : "+brand);
        System.out.println("model name : "+model);
        System.out.println("year name : "+year);
        System.out.println("Total fuel : "+fuel);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        car c1 = new car();
        System.out.println("Enter the brand name : ");
        c1.brand = sc.next();
        System.out.println("Enter the model name : ");
        c1.model = sc.next();
        System.out.println("Enter the year : ");
        c1.year = sc.nextInt();
        System.out.println("Enter the fuel : ");
        c1.fuel = sc.nextInt();
        c1.display();
        System.out.println("Enter the liter to reduce by distance : ");
        int reduce = sc.nextInt();
        c1.drive(reduce);
        c1.display();

    }
}
