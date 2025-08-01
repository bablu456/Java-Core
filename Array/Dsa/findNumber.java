package Array.Dsa;
import java.util.Scanner;
public class findNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elemnts in the array : ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number for the search : ");
        int num = sc.nextInt();
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(arr[i]+arr[j]== num){
                    System.out.println("("+i+","+j+")");
                }
            }
        }
    }
}
