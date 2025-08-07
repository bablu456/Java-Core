package Array.home_Work;

import java.util.ArrayList;

public class cloneArrayList {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        ArrayList<Integer> list2 = (ArrayList<Integer>) list.clone();
        System.out.println(list2);
    }
}
