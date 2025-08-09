package class_work;
import java.util.Scanner;
public class Prime_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int a = sc.nextInt();
        boolean flag = true;
        for(int i=2;i<a;i++){
            if(a%i==0){
                flag = false;
            }
            
        }
        if(flag){
            System.out.println("this is a prime no "+a);
        }else{
            System.out.println("this is not a prime no ");
        }
    }
}
