package constructor.practice;

public class Student {
    int id;
    String name;
    Student(int id,String name){
        this.id = id;
        this.name = name;
    }
    void pass(){
        info p = new info();
        p.printInfo(this);
    }
}
class info{
    void printInfo(Student s){
        System.out.println("Id : "+s.id);
        System.out.println("Name : "+s.name);
    }
    public static void main(String[] args) {
        Student s1 = new Student(123,"Bablu");
        s1.pass();
    }
}
