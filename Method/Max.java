package Method;
import java.util.Scanner;
public class Max {
    public static int Bigger(int a,int b){
        if(a>b){
            return a;
        }else{
            return b;
        }
    }
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number : ");
        int num2 = sc.nextInt();
        int store = Bigger(num1,num2);
        System.out.println("this number is big one "+store);

    }
}
