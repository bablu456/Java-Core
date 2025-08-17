package Home_Work;

import java.util.Scanner;

public class Mobile_phone {
    String brand;
    String model;
    int battery;
    boolean isOn;
    void turnOn(){
        isOn = true;
        System.out.println("the phone is now on !!");
    }
    void usePhone(int minutes){
        battery = battery - (minutes % 10);
        System.out.println("this "+minutes+"you have used your phone ");
    }
    void chargephone(int amount){
        battery= battery + amount;
        System.out.println("the updated battery after charging is : "+battery);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mobile_phone mp = new Mobile_phone();
        System.out.println("Enter the phone brand name : ");
        mp.brand = sc.nextLine();
        System.out.println("Enter the phone model name : ");
        mp.model = sc.nextLine();
        System.out.println("Enter the battery percentage : ");
        mp.battery = sc.nextInt();
        mp.turnOn();
    }
}
