package BinarySearch;

public class MisingPostitve {
    public static int findNum(int[] arr,int target){
        int left = 0;
        int right = arr.length - 1;
        int mid = 0;
        while(left<=right){
            mid = left + (right - left) / 2;
            int missing = arr[mid] - (mid + 1);
            if(missing>target){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return left+target;
    }
    public static void main(String[] args){
        int[] arr = {2,3,4,7,11};
        int target = 5;
        int reuslt = findNum(arr,target);
        System.out.println(reuslt);
    }
}
