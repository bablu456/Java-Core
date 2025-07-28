package Method.old_functionPractice;

import java.util.Scanner;

public class multi_fun {
    int multi(int a,int b){
        return a * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        multi_fun m2  = new multi_fun();
        System.out.println("Enter the furst number : ");
        int a = sc.nextInt();
        System.out.println("Enter the second number : ");
        int b  = sc.nextInt();
        int store  = m2.multi(a,b);
        System.out.println("after multi the number is "+store);
    }
}
