package Array_List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Basics_Array_list {
    public static void main(String[] args){
        ArrayList<Integer>list = new ArrayList<>();
        list.add(0);
        list.add(2);
        list.add(3);
        System.out.println(list);
        int elemnt = list.get(0);
        System.out.println(elemnt);
        list.add(1,1);
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
        int size = list.size();
        System.out.println(size);
        list.add(0,5);
        Collections.sort(list);
        System.out.println(list);
    }
}
