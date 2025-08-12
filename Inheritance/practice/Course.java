package Inheritance.practice;

public class Course {
    String courseName = "Java Programming ....";
    void showCourse(){

    }
}
class EnrollStudent extends Course{
    String name = "Bablu";
    int rollNumber = 12;
    void showCourse(){
        System.out.println("Course name : "+courseName);
        System.out.println("Name : "+name);
        System.out.println("RollNumber : "+rollNumber);

    }
    public static void main(String[] args){


    }
}