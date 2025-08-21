package MegaTestPractice.arraysAndArraysList;

import java.util.ArrayList;
import java.util.Arrays;

public class RetainAll {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(3,4,5,6));
        list.retainAll(list1);
        System.out.println(list);
    }
}
