package MegaTestPractice.arraysAndArraysList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortElement {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4,1,3,2));
        Collections.sort(list);
        System.out.println(list);
    }
}
