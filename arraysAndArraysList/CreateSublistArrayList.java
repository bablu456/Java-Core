package MegaTestPractice.arraysAndArraysList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateSublistArrayList {
    public static void main(String[] args){
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        List<Integer> subList = list1.subList(1,3);
        System.out.println(subList);
    }
}
