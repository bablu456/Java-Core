package MegaTestPractice.arraysAndArraysList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReplaceAllElements {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,5));
        Collections.fill(list,0);
        System.out.println(list);
    }
}
