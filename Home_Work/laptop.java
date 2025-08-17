package Home_Work;

import java.util.Scanner;

public class laptop {
    String brand;
    String processor;
    int ramsize;
    boolean isPowerOn;
    void powerOn(){
        if(isPowerOn!=true){
            isPowerOn = true;
        }
        System.out.println("Welcome to the laptop programm !! ");
    }
    void upgradeRam(int ram){
        ramsize = ramsize + ram;
        System.out.println("After upgrading ram the size is "+ramsize);
    }
    void showInfo(){
        System.out.println("The brand is : "+brand);
        System.out.println("The processor is : "+processor);
        System.out.println("The ram size is : "+ramsize);
        System.out.println("power on : "+isPowerOn);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        laptop l1 = new laptop();
        System.out.println("Enter the brand name : ");
        l1.brand = sc.next();
        System.out.println("Enter the processor name : ");
        l1.processor = sc.next();
        System.out.println("Enter the ram size :");
        l1.ramsize = sc.nextInt();
//        System.out.println("Enter the ");

    }

}
