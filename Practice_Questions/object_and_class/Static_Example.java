package Practice_Questions.object_and_class;

public class Static_Example {
    int age;
    String name;
    int salary;
    boolean married;
    static long polulation;
    public Static_Example(int age,String name,int salary,boolean married){
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        this.polulation += 1;
    }
}
