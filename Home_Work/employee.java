package Home_Work;

import java.util.Scanner;

public class employee {
    String name;
    int employeeid;
    double salary;
    String department;
    void work(int hours){
        System.out.println("This employee wrok that hour : "+hours);
    }
    void updateSalary(double newSalary){
        salary = newSalary;
    }
    void showDetails(){
        System.out.println("Employee name : "+name);
        System.out.println("Employee id : "+employeeid);
        System.out.println("Employee salary : "+salary);
        System.out.println("Employee department : "+department);
    }

    public static void main(String[] args) {
        employee e1 = new employee();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the employee name : ");
        e1.name = sc.nextLine();
        System.out.println("Enter the employee id : ");
        e1.employeeid = sc.nextInt();
        System.out.println("Enter the employee salary : ");
        e1.department = sc.next();
        System.out.println("Enter the how many hour he works : ");
        int hour = sc.nextInt();
        e1.work(hour);
        e1.showDetails();
    }
}
