package Practice_Questions;

import java.util.Scanner;

class Students{
    String name;
    int RollNumber;
    int Marks;
    public void PrintInfo(){
        System.out.println("Name : "+this.name);
        System.out.println("Roll Number : "+this.RollNumber);
        System.out.println("Marks : "+this.Marks);
    }
}
public class Students_Details {
    public static void main(String[] args){
        Students s1 = new Students();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the student name : ");
        s1.name = sc.nextLine();
        System.out.println("Enter the  student roll number : ");
        s1.RollNumber = sc.nextInt();
        System.out.println("Enter the  student marks : ");
        s1.Marks = sc.nextInt();
        s1.PrintInfo();

    }
}
