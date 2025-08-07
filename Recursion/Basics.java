package Recursion;
import java.util.Scanner;
public class Basics {
    public static void printnum(int n){
        if(n==0){
            return;
        }
        System.out.print(n);
        printnum(n-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        printnum(num);

    }
}
