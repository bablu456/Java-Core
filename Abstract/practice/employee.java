package Abstract.practice;

import javax.naming.PartialResultException;

abstract class employee {
    final double FTE = 50000;
    final double PART = 500;
    String name;
    abstract void calculateSalary();
    employee(String name){
        this.name = name;
    }
}
class FullTimeEmpoyee extends employee{
    FullTimeEmpoyee(String name){
        super(name);
    }
    void calculateSalary(){
        System.out.println("Name : "+name+"\nSalary : "+FTE);
    }
}
class PaertTimeEmployee extends employee{
    PaertTimeEmployee(String name){
        super(name);
    }
    void calculateSalary(){
        System.out.println("Name : "+name+"\nSalary : "+PART * 40);
    }
    public static void main(String[] args){
        FullTimeEmpoyee f = new FullTimeEmpoyee("Sumit");
        f.calculateSalary();
    }
}
