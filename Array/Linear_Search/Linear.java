package Array.Linear_Search;
import  java.util.Scanner;
public class Linear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the Elements in the array : ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number for search : ");
        int num = sc.nextInt();
        boolean flag = false;
        for(int i=0;i<size;i++){
            if(arr[i] == num){

            }
        }
    }
}
