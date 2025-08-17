package Home_Work.function_practice;
import java.util.Scanner;
public class find_prime {
    void prime(int a , int b){
        boolean flag = true;
        for(int i=2;i<=b;i++){
            for(int j=2;j<i;j++){
                if(i%j==0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.println("the prime no is "+i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        find_prime p = new find_prime();
        System.out.println("Enter the first number : ");
        int a = sc.nextInt();
        System.out.println("Enter the second number : ");
        int b = sc.nextInt();
        p.prime(a,b);
    }
}
