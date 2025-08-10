package Polymorphism.home_work;

public class Calculator {
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[] args){
        Calculator c = new Calculator();
        int store = c.add(5,5);
        System.out.println("The first method Sum : "+store);
        int store2 = c.add(5,5,5);
        System.out.println(("The second method sum : "+store2));
    }
}
