package BinarySearch.practice;

public class searchInsertPosi {
    static int Search(int[] arr,int targe){
        int left = 0;
        int right = arr.length;
        int mid = 0;
        while(left<=right){
            mid = left + (right - left) / 2;
            if(arr[mid] == targe){
                return mid;
            } else if (targe>arr[mid]) {
                left = mid + 1;
            }else{
                right = mid -1;
            }
        }
        return left;
    }
    public static void main(String[] args){
        int[] arr = {1,2,4,5};
        int taget = 3;
        int starget = 4;
        System.out.println(Search(arr,starget));
    }
}
