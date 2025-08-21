package MegaTestPractice.arraysAndArraysList;

import java.util.ArrayList;
import java.util.Arrays;

public class CloneArrayList {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        ArrayList<Integer> list2 = (ArrayList) list.clone();
        System.out.println(list2);
    }
}
