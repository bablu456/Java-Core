package Array.home_Work;

import java.util.Scanner;

public class CountEvenOdd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size Of Array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int evenCount = 0;
        int oddCount = 0;
        System.out.println("Enter the Elements In The Array : ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
            if(arr[i] % 2 == 0){
                evenCount++;
            }else{
                oddCount++;
            }
        }
        System.out.println("There is Total "+evenCount+" even number !! ");
        System.out.println("There is Total "+oddCount+" odd number !! ");
    }
}
