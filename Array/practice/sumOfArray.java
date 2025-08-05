package Array.practice;

import java.util.Scanner;

public class sumOfArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the Array : ");
        int size = sc.nextInt();
        System.out.println("Enter the Elements in the : ");
        int[] arr = new int[size];
        int sum = 0;
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
