package MegaTestPractice.arraysAndArraysList;

public class ArryasPalindrome {
    static boolean Palindrome(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=arr[arr.length-1-i]) return false;
        }
        return true;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,2,1};
        boolean result = Palindrome(arr);
        System.out.println("This Array is Palindrome : "+result);
    }
}
