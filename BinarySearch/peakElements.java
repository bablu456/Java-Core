package BinarySearch;

public class peakElements {
   static int findPeakelemnts(int[] arr){
        int left = 0;
        int right = arr.length - 1;
        int ans = 0;
        while(left <=right){
            int mid = left + (right - left) / 2;
            if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid -1]){
                return mid;
            } else if (arr[mid]>arr[mid+1]) {
                right = mid + 1;
            }else{
                left = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr = {1,2,7,5,3,2,1};
        int result = findPeakelemnts(arr);
        System.out.println(result);
    }
}
