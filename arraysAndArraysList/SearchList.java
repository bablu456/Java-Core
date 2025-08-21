package MegaTestPractice.arraysAndArraysList;

import java.util.ArrayList;
import java.util.Arrays;

public class SearchList {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        int index = list.indexOf(2);
        if(index!=-1){
            System.out.println("The 2 is Available on The "+index);
        }
    }
}
