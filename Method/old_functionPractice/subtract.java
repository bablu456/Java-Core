package Method.old_functionPractice;

import java.util.Scanner;

public class subtract {
    int sub(int a,int b){
        return  a -b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        subtract s1 = new subtract();
        System.out.println("Enter the first number : ");
        int a = sc.nextInt();
        System.out.println("Enter the second number : ");
        int b = sc.nextInt();
        int store  = s1.sub(a,b);
        System.out.println("After the subtraction the value is "+store);
    }
}
