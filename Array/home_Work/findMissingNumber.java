package Array.home_Work;

import java.util.Scanner;

public class findMissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 4, 5};
        int N = arr.length+1;
        int xorFull = 0;
        int xorArr = 0;
        for (int i = 1; i <= N; i++) {
            xorFull ^= i;
        }
        for (int val : arr) {
            xorArr ^= val;
        }
        int result = xorFull ^ xorArr;
        System.out.println(result);
    }

}

