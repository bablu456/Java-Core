package Home_Work.inheritance;

import java.util.Scanner;

public class School {
    Scanner sc = new Scanner(System.in);
    String schoolName;
    void input1(){
        System.out.println("Enter the school name : ");
        schoolName = sc.nextLine();
    }
    void showSchool(){
        System.out.println("School name is : "+schoolName);
    }
}
class Teacher extends School{
    Scanner sc = new Scanner(System.in);
    String name;
    void input(){
        System.out.println("Enter the Teacher Name : ");
        name = sc.nextLine();
    }
    void showTeacherDetails(){
        System.out.println("School : "+schoolName);
        System.out.println("Teacher : "+name);
    }

    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.input1();
        t.input();
        t.showTeacherDetails();
    }
}
