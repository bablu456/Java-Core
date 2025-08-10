package Oops;
import java.util.*;
    class student{
        String name;
        String class_name;
        int age;
    }
public class impletion {
    public static void main(String[] args){
        student s1 = new student();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the student name : ");
        s1.name = sc.nextLine();
        System.out.println("Enter the student class name : ");
        s1.class_name = sc.next();
        System.out.println("Enter the student age :");
        s1.age = sc.nextInt();
        System.out.println("name : "+s1.name);
        System.out.println("Class name : "+s1.class_name);
        System.out.println("Age : "+s1.age);

    }
}
