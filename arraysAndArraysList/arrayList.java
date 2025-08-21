package MegaTestPractice.arraysAndArraysList;

import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("java");
        list.add("Python");
        list.add("C++");
        System.out.println(list);
        list.remove("Python");
        System.out.println(list);
        list.set(1,"go");
        System.out.println(list);
    }
}
