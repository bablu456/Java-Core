package Array.home_Work;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class sortingTheArrayList {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter the Elements in the Array List : ");
        for(int i=0;i<5;i++){
            list.add(sc.nextInt());
        }
        Collections.sort(list);
        System.out.println(list);
    }
}
