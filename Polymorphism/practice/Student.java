package Polymorphism.practice;

public class Student {
    void printDetails(String name,int age){
        System.out.println("Name : "+name+"\nage : "+age);
    }
    void printDetails(String name, int age,String course){
        System.out.println("Name : "+name+"\nAge : "+age+"\nCourse : "+course);
    }
    public static void main(String[] args){
        Student s = new Student();
        s.printDetails("Bablu",22);
        s.printDetails("Bablu roy",23,"B.Tech");
    }
}
