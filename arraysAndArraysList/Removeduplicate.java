package MegaTestPractice.arraysAndArraysList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Removeduplicate {
    public static void main(String[] args){
        ArrayList<Integer> list  = new ArrayList<>(Arrays.asList(1,2,3,4,5,5));
        Set<Integer> l = new LinkedHashSet<>(list);
        ArrayList<Integer> list1 = new ArrayList<>(l);
        System.out.println(list1);
    }
}
