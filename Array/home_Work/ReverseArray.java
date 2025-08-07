package Array.home_Work;

import java.util.Scanner;

public class ReverseArray {
  static   void Reverse(int[] arr){
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
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size Of The Array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter The Elements In The Array : ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        Reverse(arr);
        for(int num : arr){
            System.out.print(num+" ");
        }
    }
}
