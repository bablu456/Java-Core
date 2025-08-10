package Polymorphism.practice;
import java.util.Scanner;
public class Calculator {
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[] args){
        Calculator c = new Calculator();
        Scanner sc = new Scanner(System.in);
        int store = c.add(5,5);
        System.out.println("The Sum of The First Method is : "+store);
        int store2 = c.add(5,5,5);
        System.out.println("The Sum of the Second Method is : "+store2);
    }
}
