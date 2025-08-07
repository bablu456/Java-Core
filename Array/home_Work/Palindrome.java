package Array.home_Work;

public class Palindrome {
    public static void main(String[] args){
        int[] arr = {1,2,3,2,1};
        int rev = 0;
        int size = arr.length-1;
        boolean flag = false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=arr[size-i]){
                flag = true;
            }
        }
        if(flag){
            System.out.println("this array is not palindrome !! ");
        }else{
            System.out.println("This array is a palindrome");
        }
    }
}
