package MegaTestPractice.arraysAndArraysList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayAsList {
    public static void main(String[] args){
        Integer[] arr = {1,2,3,4,5};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));
        System.out.println(list);
    }
}
