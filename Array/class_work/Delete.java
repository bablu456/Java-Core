package Array.class_work;

import java.util.Scanner;

public class Delete {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the size of the array : ");
//        int size  = sc.nextInt();
        int[] arr = {3,7,9,2,4};
        int target = 2;
        System.out.println("Enter the Elements in the array : ");
        for(int i=0;i<arr.length-1;i++){
           if(arr[i] == target){
               arr[i] = arr[i+1];
           }
        }
        int size = arr.length - 1;
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }

    }
}
