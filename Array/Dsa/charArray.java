package Array.Dsa;

public class charArray {
   static char SmallestLetter(char[] arr,char target){
        int left = 0;
        int right = arr.length-1;
        int mid = 0;
        char ans = 0;
        while(left<=right){
            mid = left + (right - left ) / 2;
           if(arr[mid]>target){
               right = mid - 1;
           }else{
               left = mid + 1;
           }

        }
       System.out.println(arr[left]);
        return arr[left % arr.length];
    }
    public static void main(String[] args){
        char[] arr = {'c','f','j'};
        char target = 'a';
        System.out.println(SmallestLetter(arr,target));
    }
}
