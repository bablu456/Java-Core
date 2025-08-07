package Array.home_Work;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the Array : ");
        int size = sc.nextInt();
        int[] arr= new int[size];
        int maxElem = 0;
        System.out.println("Enter the Elemnts in the Array : ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
            if(arr[i]>maxElem){
                maxElem = arr[i];
            }
        }
        int secondMax = 0;
        for(int i=0;i<size;i++){
            if(arr[i]>secondMax && arr[i]!=maxElem){
                secondMax = arr[i];
            }
        }
        System.out.println("The Second Largest Number is : "+secondMax);
    }
}
