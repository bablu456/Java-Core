package BinarySearch;

public class perfectSquare {
   static int squareCheck(int num){
       int left = 0;
       int right = num;
       int mid = 0;
       while(left<=right){
           mid = left * (right - left) / 2;
           int square = mid * mid ;
           if(square == num){
               return mid;
           }else if(square<num){
               left = mid + 1;
           }else{
               right = mid - 1;
           }
       }
       return mid;
   }
    public static void main(String[] args){
        int num = 100;
        int result = squareCheck(num);
        System.out.println(result);
    }
}
