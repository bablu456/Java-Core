package Array.class_work;

import java.util.Scanner;

public class Take_Index_print {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of The Array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the  Elements :  ");
        for(int i =0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the Index number for Direct Elements Printing : ");
        int index = sc.nextInt();
        System.out.println(arr[index]);
    }
}
