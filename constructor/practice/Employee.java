package constructor.practice;

public class Employee {
    int id;
    String name;
    String department;
    Employee(int id,String name,String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }
    Employee(int id,String name){
        this(id,name,"General");
    }
    void display(){
        System.out.println("Employee id : "+id);
        System.out.println("Employee name : "+name);
        System.out.println("Employee department : "+department);
    }
    public static void main(String[] args) {
        Employee e1 = new Employee(123,"bablu","hr");
        Employee e2 = new Employee(124,"Kumar");
        e1.display();
        e2.display();
    }
}
