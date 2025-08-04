package BinarySearch;

public class findSmallestletter {
   static char searchElement(char[] arr,char target){
       int left = 0;
       int right = arr.length-1;
       int mid = 0;
       while(left<=right){
           mid = left + (right - left) / 2;
           if(arr[mid]>target){
               right = mid - 1;
           }else{
               left = mid + 1;
           }
       }
       return arr[mid % arr.length];
    }
    public static void main(String[] args){
        char[] str = {'c','f','j'};
        char target = 'a';
        System.out.println(searchElement(str,target));
    }
}
