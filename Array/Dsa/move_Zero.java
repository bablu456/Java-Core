package Array.Dsa;
import java.util.Scanner;
public class move_Zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elemnts in the array : ");
        for(int i =0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<size;i++){
            if(arr[i] == 0){
                arr[i] = arr[i+1];
            }
        }
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }

    }
}
