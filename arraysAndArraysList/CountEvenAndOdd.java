package MegaTestPractice.arraysAndArraysList;

import java.util.zip.CheckedOutputStream;

public class CountEvenAndOdd {
    static void Count(int[] arr){
        int OddCount = 0;
        int EvenCount = 0;
        for(int i : arr){
            if(i % 2 == 0) OddCount++;
            else EvenCount++;
        }
        System.out.println("The Total Even Elements is : "+OddCount);
        System.out.println("The Total Odd Elements is : "+EvenCount);
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        Count(arr);
    }
}
