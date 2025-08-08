package Array.class_work;

import java.util.Scanner;

public class Zero_and_One {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of The Array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];

                int count = -1;
        int i = 0;
        while(i<size){
            int n = sc.nextInt();
            if(n==1 || n==0){
                count++;
                arr[i] = n;
                i++;
            }else{
                System.out.println("Please Enter 1 And 0 only !!");
                if(i>=0 && i>=count) i--;
                i = count;
            }
        }
    }
}
