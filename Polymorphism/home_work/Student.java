package Polymorphism.home_work;

public class Student {
    void printDetails(String name,int age){
        System.out.print("Name : "+name);
        System.out.println(", Age : "+age);
    }
    void printDetails(String name,int age,String course){
        System.out.print("Name : "+name);
        System.out.print(", Age : "+age);
        System.out.println(", Course : "+course);
    }
    public static void main(String[] args){
        Student s = new Student();
        s.printDetails("Bablu",12);
        s.printDetails("Bablu",15,"B.tech");
    }
}
