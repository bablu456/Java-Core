package Home_Work.inheritance;

import java.util.Scanner;

public class Course {
    Scanner sc = new Scanner(System.in);
    String courseName;
    void input(){
        System.out.println("Enter the Course name : ");
        courseName = sc.next();
    }
    void showCourse(){
        System.out.println("Course Name : "+courseName);
    }
}
class EnrolledStudent extends Course{
    Scanner sc = new Scanner(System.in);
    String name;
    int rollNumber;
    void input1(){
        System.out.println("Enter the name : ");
        name = sc.nextLine();
        System.out.println("Enter the roll numebr : ");
        rollNumber = sc.nextInt();
    }
void showCourse(){
    System.out.println("Course name : "+courseName);
    System.out.println("Student Name : "+name);
    System.out.println("Roll no : "+rollNumber);
}
    public static void main(String[] args) {
        EnrolledStudent e = new EnrolledStudent();
        e.input();
        e.input1();
        e.showCourse();

    }
}
