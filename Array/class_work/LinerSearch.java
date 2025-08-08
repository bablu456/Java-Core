package Array.class_work;

import java.util.Scanner;

public class LinerSearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size Of the Array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements in the array : ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        boolean flag = false;
        System.out.println("Enter the Number to search In this array : ");
        int search = sc.nextInt();
        for(int i=0;i<size;i++){
            if(arr[i] == search){
                flag = true;
            }
        }
        if(flag){
            System.out.println("The number is presetn in the array : ");
        }else{
            System.out.println("The number is not present in the array : ");
        }
    }

}
