package Inheritance;
import java.util.Scanner;
public class Inheritance_Apply {
    int age;
    void show(){
        System.out.println("this is a parents Class !! ");
    }
}
class child extends Inheritance_Apply{
    void info(){
        System.out.println("this is a information !! ");
    }

    public static void main(String[] args) {
        child c = new child();
        c.show();
        c.info();
    }

}
