package MegaTestPractice.arraysAndArraysList;

import java.util.ArrayList;
import java.util.Arrays;

public class CompareTwoList {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4));
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4));
        System.out.println(list.equals(list1));
    }
}
