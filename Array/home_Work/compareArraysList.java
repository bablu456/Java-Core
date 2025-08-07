package Array.home_Work;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ArrayList;

public class compareArraysList {
    public static void main(String[] args){
        ArrayList<Integer> list =  new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        boolean result = list1.equals(list);
        System.out.println(result);

    }
}
