package Practice_Questions.polymorpshism_practice;
import java.util.Scanner;
public class Calculator {
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Calculator c = new Calculator();
        System.out.println("Enter the Number : ");
        int a = sc.nextInt();
        System.out.println("Enter the Second Number : ");
        int b = sc.nextInt();
        int result = c.add(a,b);
        System.out.println("The Addition of Two number result is here : "+result);
        int result2 = c.add(5,5,5);
        System.out.println("Three number Add : "+result2);
    }
}
