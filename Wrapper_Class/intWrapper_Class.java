package Wrapper_Class;
import java.util.Scanner;
public class intWrapper_Class {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        Integer a = num;
        int n = a.intValue();
        System.out.println(n);
    }
}
