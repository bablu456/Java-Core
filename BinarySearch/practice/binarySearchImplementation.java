package BinarySearch.practice;

public class binarySearchImplementation {
    static int Binary(int[] arr,int target){
        int left = 0;
        int right = arr.length - 1;
        int mid = 0;
        while (left<=right){
            mid = left + (right - left) / 2;
            if(arr[mid] > target){
                right = mid - 1;
            }else if(target > arr[mid]){
                left = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int target = 4;
        int starget = 2;
        System.out.println(Binary(arr,target));
    }
}
