package Loops;
import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for palindrome : ");
        int num = sc.nextInt();
        int copy = num;
        int rev = 0;
        boolean flag = true;
        for(int i=0;num!=0;i++){
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        System.out.println(rev);
        for(int i=1;copy!=0;i++){
            int a = copy / 10;
            int b = rev / 10;
            copy= copy / 10;
            rev = rev / 10;
            if(a!=b){
                flag = false;
                break;
            }
            }
        if(flag){
            System.out.println("this is a palimdrome ");
        }else{
            System.out.println("this is not a palindrome ");
        }
    }
}
