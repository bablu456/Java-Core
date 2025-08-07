package Array.home_Work;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size Of The Array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int sum = 0;
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.println("The Sum Of ALl Elements in the Array is : "+sum);
    }
}
