package Method;
import java.util.Scanner;
public class numbersAverage {
    public static void Average(int a ,int b,int c){
        System.out.println("The average of total number is : "+(a+b+c)/3);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the firs number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number : ");
        int num2 = sc.nextInt();
        System.out.println("Enter the third number : ");
        int num3 = sc.nextInt();
        Average(num1,num2,num3);
    }
}
