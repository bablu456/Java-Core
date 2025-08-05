package Array.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayList {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("java");
        list.add("Python");
        list.add("C++");
        list.remove("python");
        list.set(2,"go");
        System.out.println(list);


    }
}
