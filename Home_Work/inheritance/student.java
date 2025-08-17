package Home_Work.inheritance;

import java.util.Scanner;

public class student {
    String name;

    void display() {
        System.out.printf("Student name is : %s", name);
    }
}

class MarkSheet extends student {
    Scanner sc = new Scanner(System.in);
    int totalmarks = 0;

    void take() {
        System.out.print("Enter the student name : ");
        name = sc.nextLine();
        System.out.print("Enter the Total marks in student : ");
        totalmarks = sc.nextInt();
    }
    void display() {
        System.out.print("the name of the student is --> " + super.name + "\nand the total marks is ------>" + totalmarks);

    }
    public static void main(String[] args) {
        MarkSheet m = new MarkSheet();
        m.take();
        m.display();
    }
}