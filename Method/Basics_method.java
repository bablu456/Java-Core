package Method;
import java.util.Scanner;
public class Basics_method {
public static int fun(int a,int b){
    return  a+b;
}
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1 : ");
        int num1 = sc.nextInt();
        System.out.println("Enter the number 2 : ");
        int num2 = sc.nextInt();
        int sum = fun(num1,num2);
        System.out.println(sum);
    }
}
