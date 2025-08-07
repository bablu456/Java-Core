package Array.home_Work;

import java.util.Scanner;

public class MaximumElements {
    static int maxEleme(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static int minEleme(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size Of The Array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("enter the Elements in the array : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int maxResult = maxEleme(arr);
        int minResult = minEleme(arr);
        System.out.println("The Max Elements Is : "+maxResult);
        System.out.println("The Min Elemnts Is : "+minResult);
    }
}
