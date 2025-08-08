package Array.class_work;

import java.util.Scanner;

public class ReverseNumber {
  static   void revrse(int[] arr){
        int i=0,j=arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        revrse(arr);
        for(int i : arr){
            System.out.println(i);
        }
    }
}
