package Array.class_work;

import java.util.Scanner;

public class Product {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size Of the Array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int product = 1;
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
            product *= arr[i];
        }
        System.out.println(product);
    }
}
