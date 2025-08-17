package Home_Work.inheritance;

import java.util.Scanner;

public class Employee {
    Scanner sc  = new Scanner(System.in);
    String name;
    void input1(){
        System.out.println("Enetr the Employee Name : ");
        name = sc.nextLine();
    }
    void displayInfo(){
        System.out.println("Employee name : "+name);
    }
}
class Manager extends Employee{
    Scanner sc = new Scanner(System.in);
    String department;
    void input(){
        System.out.println("Enter the Department Name : ");
        department = sc.nextLine();
    }
    void displayInfo(){
        System.out.println("Name : "+name);
        System.out.println("Department : "+department);
    }
    public static void main(String[] args) {
        Manager m = new Manager();
        m.input1();
        m.input();
        m.displayInfo();
    }
}
