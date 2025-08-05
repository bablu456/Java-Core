package Array.practice;

import java.util.Scanner;

public class secondLargest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int max = 0;
        System.out.println("Enter the Elements of the array : ");
        for(int i=0;i<size;i++){

            arr[i] = sc.nextInt();
            if(arr[i]>max) max = arr[i];
        }
        int smax = 0;
        for(int i=0;i<size;i++){
            if(arr[i]>smax && arr[i]!=max){
                smax = arr[i];
            }
        }
        System.out.println(smax);
    }
}
