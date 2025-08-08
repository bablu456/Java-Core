package Array.class_work;

import java.util.Scanner;

public class Aevrage_Elements {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int EvenSum = 0;
        int evenCount = 0;
        int oddCount = 0;
        int oddSum = 0;
        System.out.println("Enter the Size Of The Array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the Elements In The Array : ");
        for(int i=0;i<size;i++){
            System.out.print("Enter the "+i+"Index : ");
            arr[i] = sc.nextInt();
            if(arr[i]%2==0){
                EvenSum += arr[i];
                evenCount++;
            }
            else{
                oddCount++;
                oddSum += arr[i];
            }
        }
        System.out.println("Average Of Even Number : "+EvenSum/evenCount);
        System.out.println("Average Of Odd Number : "+oddSum/oddCount);
    }
}
