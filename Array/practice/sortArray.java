package Array.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class sortArray {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(3);
        list.add(1);
        list.add(9);
        Collections.sort(list);
        System.out.println(list);
    }
}
