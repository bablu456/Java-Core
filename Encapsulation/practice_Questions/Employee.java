package Encapsulation.practice_Questions;

public class Employee {
    private String name;
    private int employeelID;
    private double salary;
    private double bonus;
    Employee (String name,int employeelID,double salary){
        this.name = name;
        this.employeelID = employeelID;
        this.salary = salary;
    }
    int getEmployeelID(){
        return employeelID;
    }
    String getName(){
        return name;
    }
    double getSalary(){
        return salary;
    }
    double getBonus(){
        return bonus;
    }
    public void setBonus(double b){
        if(b<=0){
            return;
        }
        bonus = b;
    }
    double getTotalPay(){
        return salary + bonus;
    }
    String getEmployeeDetails(){
        return "Employee ID : "+employeelID+"\nName : "+name+"\nSalary"+String.format("%.2f",salary)+"\nBonus : $"+String.format("%.2f",bonus)+"\nTotal Pay : $"+String.format("%.2f",getTotalPay());
    }
    public void giveRaise(double percentage){
        if(percentage < 0){
            System.out.print("Raise percentage Cannot be Negative or Zero ");
            return;
        }
        double raiseAmount = salary * (percentage/100);
        salary += raiseAmount;
        System.out.print("Salary Increased %.2f%% (Added $%.2f)\n");


    }
    public static void main(String[] args){
        Employee e = new Employee("Bablu",123,10000);
        e.setBonus(3000);

        System.out.println("\n ------ Employee Details ------");
        System.out.println(e.getEmployeeDetails());

    }
}
