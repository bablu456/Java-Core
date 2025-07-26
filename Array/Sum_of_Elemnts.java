package Array;

import java.util.Scanner;

public class Sum_of_Elemnts {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elemnts in the array : ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }
        boolean flag = true;
        System.out.println("Enter the number for the search : ");
        int search = sc.nextInt();
        for(int i=0;i<size;i++){
            if(search == arr[i]){
              flag = false;
            }
        }
        if(flag){
            System.out.println("number didn't found !! ");
        }else{
            System.out.println("The number is available in the array !! ");
        }
    }
}
