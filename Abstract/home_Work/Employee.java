package Abstract.home_Work;

abstract class Employee {
    final int FTE = 50000;
    final int PTE = 500;
    String name;
    Employee (String name){
        this.name = name;
    }
    abstract void calculateSalary();
}
class FullTimeEmployee extends Employee{
    FullTimeEmployee(String name){
        super(name);
    }
    void calculateSalary(){
        System.out.println("Your Name Is "+name+"your Full time Salary is : "+FTE);
    }
}
class PartTimeEmployee extends Employee{
    PartTimeEmployee (String name){
        super(name);
    }
    void calculateSalary(){
        System.out.println("your Name is "+name+"your total salary is : "+PTE * 40);
    }
    public static void main(String[] args){
        FullTimeEmployee f = new FullTimeEmployee("Bablu");
        f.calculateSalary();
        PartTimeEmployee p = new PartTimeEmployee("Sandeep");
        p.calculateSalary();
    }
}
