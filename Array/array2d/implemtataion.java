package Array.array2d;

import java.util.Scanner;

public class implemtataion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Row Size  : ");
        int row = sc.nextInt();
        System.out.println("Enter the Column Size : ");
        int column = sc.nextInt();
//        System.out.println();
        int[][] arr = new int[row][column];
        System.out.println("Enter the Elemnts In The Arrays : ");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Now Let's Print The Elements : ");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
