package Home_Work.constructor;

public class Employee {
    int id;
    String name;
    String department;
    Employee(int id,String name,String department){
        this.id = id;
        this.name = name;
        this.department = department;
    }
    Employee(){
        this(123,"Bablu","General");
    }
    void display(){
        System.out.println("Id "+id);
        System.out.println("Name : "+name);
        System.out.println("Department : "+department);
    }
    public static void main(String[] args){
        Employee e = new Employee();
    }
}
