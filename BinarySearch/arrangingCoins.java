package BinarySearch;

public class arrangingCoins {
    static int ArrangeCoins(int n){
        int left = 0;
        int right = n;
        int mid = 0;
        while(left<=right){
            mid = left + (right - left) / 2;
            long curr = (long)mid * (mid + 1)/2;
            if(curr == n) return mid;
            else if(curr>n){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return right;
    }
    public static void main(String[] args){
        int n = 10;
        int reuslt = ArrangeCoins(n);
        System.out.println(reuslt);
    }
}
