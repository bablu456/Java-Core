package BinarySearch;

import java.lang.module.FindException;
import java.util.Scanner;

public class searchInsertPosition {
   static int index(int[] arr,int target){
        int left = 0;
        int right = arr.length-1;
        int mid = 0;
        while(left <= right){
            mid = left + (right - left) / 2;
            if(arr[mid]<target){
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        return mid;
    }
    public static void main(String[] args){
        int[] arr = {1,2,4,5};
        int target = 3;
        System.out.println(index(arr,target));

    }
}
