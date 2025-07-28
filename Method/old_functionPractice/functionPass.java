package Method.old_functionPractice;
import java.util.Scanner;
public class functionPass {
 public static   void fun(){

     Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int a = sc.nextInt();
     System.out.println("Enter the second number : ");
     int b = sc.nextInt();
     add(a,b);
    }
    public static void add(int a,int b){
        System.out.println("the sum of two number is : "+(a+b));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        fun();

    }
}
