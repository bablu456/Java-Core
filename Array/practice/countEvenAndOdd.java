package Array.practice;

import java.util.Scanner;

public class countEvenAndOdd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of The : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int evenCount = 0;
        int oddCount = 0;
        System.out.println("Enter the elements in the array : ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
            if(arr[i] % 2 == 0){
                evenCount++;
            }else{
                oddCount++;
            }
        }
        System.out.println(evenCount+" "+oddCount);
    }
}
