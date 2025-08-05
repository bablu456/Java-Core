package Array.practice;

import java.util.Scanner;

public class reverseArray {
    static void reverse(int[] arr){
        int i =0;
        int j = arr.length - 1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of The Array : ");
        int size= sc.nextInt();
        System.out.println("Enter the Elements in the array : ");
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        reverse(arr);
        for(int num : arr){
            System.out.println(num);
        }

    }
}
