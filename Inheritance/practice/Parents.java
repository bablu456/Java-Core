package Inheritance.practice;

public class Parents {
    Parents(){
        System.out.println("Parent Constructor called !!!");
    }
}
class Child extends Parents{
    Child(){
        super();
        System.out.println("Child Constructor called !!!");
    }
    public static void main(String[] args){
        Child n = new Child();
    }
}
