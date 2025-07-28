package Method;
import java.util.Scanner;
public class sum_method {
    public static void main(String[] args){
        int ans = sum2();
        System.out.println("the sum of two number is : "+ans);
    }
    static int sum2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter the number 2 : ");
        int num2 = sc.nextInt();
        return num1 + num2;
    }
}
