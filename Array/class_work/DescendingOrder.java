package Array.class_work;

import java.util.Scanner;

public class DescendingOrder {
  static   void Descending(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i] =arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array : ");
        int size = sc.nextInt();
        int [] arr = new int[size];
        System.out.println("Enter the elements in the array : ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        Descending(arr);
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
