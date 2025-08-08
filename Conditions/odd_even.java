package Conditions;
import java.util.Scanner;
public class odd_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the any number : ");
        int num = sc.nextInt();
        for(int i=1;i<=num;i++){
            if(i%2==0){
                System.out.println("this is a even number : "+i);
            }else{
                System.out.println("this is a odd number : "+i);
            }
        }
    }
}
