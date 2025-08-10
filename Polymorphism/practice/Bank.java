package Polymorphism.practice;
import java.util.Scanner;
public class Bank {
    int getIntrest(){
        return 0;
    }
}
class Sbi extends Bank{
    int getIntrest(){
        return 5;
    }
}
class HDfc extends Bank{
    int getIntrest(){
        return 6;
    }
}
class icici extends Bank{
    int getIntrest(){
        return 7;
    }
    public static void main(String[] args){
        Sbi s = new Sbi();
        int sbi = s.getIntrest();
        System.out.println("SBI intrst rate : "+sbi);
        HDfc h = new HDfc();
        int hdfc = h.getIntrest();
        System.out.println("HDFC intrest rate : "+hdfc);
        icici i = new icici();
        int icic = i.getIntrest();
        System.out.println("ICICI intrest rate : "+icic);
    }
}
