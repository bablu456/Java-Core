package constructor;
import java.util.Scanner;
public class thisConstructor {
    String name;
    int age;
    thisConstructor(){
        this("Unknown",18);
    }
    thisConstructor(String name,int age){
        this.name = name;
        this.age = age;
    }
    void display(){
        System.out.println("Student: "+name+"\nage : "+age);
    }

    public static void main(String[] args) {
        thisConstructor s1 = new thisConstructor();
        s1.display();

    }
}
