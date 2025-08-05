package Array.practice;

import java.util.*;

public class removeDuplicate {
    public  static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(2);
        Set<Integer> set = new LinkedHashSet<>(list);
        ArrayList<Integer> list2 = new ArrayList<>(set);
        System.out.println(list2);
    }
}
