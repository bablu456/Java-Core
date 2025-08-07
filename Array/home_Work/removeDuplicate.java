package Array.home_Work;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class removeDuplicate {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<5;i++){
            list.add(sc.nextInt());
        }
        Set<Integer> set = new LinkedHashSet<>(list);
        ArrayList<Integer> list2 = new ArrayList<>(set);
        System.out.print(list2+" ");
    }
}
