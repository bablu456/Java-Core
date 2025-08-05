package Array.practice;

public class palindromeOrNot {
    static boolean check(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i] != arr[arr.length-1-i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,2,1};
        boolean result = check(arr);
        System.out.println(result);
    }
}
