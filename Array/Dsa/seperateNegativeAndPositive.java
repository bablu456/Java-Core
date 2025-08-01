package Array.Dsa;

public class seperateNegativeAndPositive {
   static void seperate(int[] arr){
        int left = 0;
        for(int right = 0;right<arr.length;right++){
            if(arr[right]<0){
                int  temp = arr[right];
                arr[right] = arr[left];
                arr[left] = temp;
                left++;
            }
        }
    }
    public static void main(String[] args){
        int[] arr = {1,-1,3,-2,5};
        seperate(arr);
        for(int i : arr){
            System.out.println(i);
        }
    }
}
