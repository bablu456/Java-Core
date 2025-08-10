package Polymorphism.home_work;

public class Employee {
    int getBonus(){
        return 1000;
    }
}
class Manager extends Employee{
    int getBonus(){
        return 2000;
    }
}
class Developer extends Employee{
    int getBonus(){
        return 3000;
    }
    public static void main(String[] args){
        Manager m = new Manager();
        int a = m.getBonus();
        System.out.println("Manager Bonus : "+a);
        Employee e = new Employee();
        int b = m.getBonus();
        System.out.println("Employee Bonus : "+b);
        Developer d = new Developer();
        int c = d.getBonus();
        System.out.println("Developer Bonus : "+c);
    }
}
