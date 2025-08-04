package BinarySearch;

public class sqrt {
    static int swrtSolve(int n) {
        int left = 0;
        int right = n;
        int mid = 0;
        int ans = 0;
        while (left <= right) {
            mid = left + (right - left) / 2;
            int square = mid * mid;
            if (square <= n) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }

        public static void main (String[]args){
            int n = 8;
            int result = swrtSolve(n);
            System.out.println(result);
        }

}
