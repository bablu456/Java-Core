package Array;

import java.util.Scanner;

public class PrimeNo {
   static boolean Primeno(int num){
       for(int i=2;i<num;i++){
           if(num%i==0){
               return false;
           }
       }
       return true;
   }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number For Chek Prime Or Not : ");
        int num = sc.nextInt();
        boolean result = Primeno(num);
        System.out.println("This number is prime "+result);
    }
}
