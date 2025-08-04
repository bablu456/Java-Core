package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class implementation {
   static int binary(int[] arr,int target){
        int left = 0;
        int right = arr.length-1;
        int mid = 0;
        while(left<=right){
            mid = left + (right - left) / 2;
            if(arr[mid] == target){
                return mid;
            }else if(target>arr[mid]){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size Of The Array : ");
        int size = sc.nextInt();
        System.out.println("Enter the Elements in the array : ");
        int[] arr = new int[size];
        for(int i =0;i<size;i++){
            arr[i] = sc.nextInt();
        }
//        Arrays.stream(arr).sorted();
        System.out.println("Enter the Search Elemnts : ");
        int search = sc.nextInt();
        int result = binary(arr,search);
        System.out.println(result);
    }
}
