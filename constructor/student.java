package constructor;

import java.util.Scanner;

public class student {
    int id;
    String name;

    student(int id,String name){

        this.id = id;
        this.name = name;
    }
}
class StudentInfoPrinter{
    void printStudentInfo(student s){
        System.out.println("this is a student id : "+s.id);
        System.out.println(s.name);

    }

    public static void main(String[] args) {
        student s1 = new student(123,"Bablu");
        StudentInfoPrinter p = new StudentInfoPrinter();
        p.printStudentInfo(s1);

    }
}