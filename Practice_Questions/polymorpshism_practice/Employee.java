package Practice_Questions.polymorpshism_practice;

public class Employee {
    int bonus(){
        return 1000;
    }
}
class Manager extends Employee{
    int bonus(){
        return 3000;
    }
}
class Devloper extends Employee{
    int bonus(){
        return 2000;
    }
    public static void main(String[] args){
        Employee e = new Employee();
        int a = e.bonus();
        Manager m = new Manager();
        int b  = m.bonus();
    }
}
