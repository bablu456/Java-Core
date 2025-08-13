package Loops;
import java.util.Scanner;
public class sum_of_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digits : ");
        int digits = sc.nextInt();
        int sum = 0;
        for(int i=1;digits!=0;i++){
             sum = digits % 10 + sum;
            digits = digits / 10;
        }
        System.out.println(sum);
    }
}
