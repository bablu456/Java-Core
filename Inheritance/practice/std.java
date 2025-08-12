package Inheritance.practice;

public class std {
    String name;
    void display(){
        System.out.println("Name : "+name);
    }
}
class Marksheet extends std{
    int marks = 500;
    void display(){
        System.out.println("Name : "+name);
        System.out.println("Total Marks : "+marks);
    }
    public static void main(String[] args){
        Marksheet m = new Marksheet();
        m.display();
    }
}
