package Practice_Questions;

import java.util.Objects;
import java.util.Scanner;

class cars {
    String brand;
    String model;
    int year;
    public void info(){
        System.out.println("the Brand name : "+this.brand);
        System.out.println("The Model no : "+this.model);
        System.out.println("the release year : "+this.year);
    }
}
public class Car_Details {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        cars c = new cars();
        System.out.println("Enter the car brand name : ");
        c.brand = sc.nextLine();
        System.out.println("Enter the model name : ");
        c.model = sc.nextLine();
        System.out.println("Enter the release date : ");
        c.year = sc.nextInt();
        c.info();
    }
}
