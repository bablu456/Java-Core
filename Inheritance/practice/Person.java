package Inheritance.practice;

public class Person {
    void showDetails(){
        System.out.println("Person Details !!");
    }
}
class Student extends Person{
    void showDetails(){
        System.out.println("Student details !!");
    }
    public static void main(String[] args){
        Student s1 = new Student();
        s1.showDetails();
    }
}
