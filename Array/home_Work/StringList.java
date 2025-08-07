package Array.home_Work;

import java.util.ArrayList;
import java.util.Scanner;

public class StringList {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        list.add("java");
        list.add("Python");
        list.add("C++");

//        for(String num  : list){
//            System.out.print(num);
//        }
        list.remove("Python");
        for(String n : list){
            System.out.println(n+" ");
        }
        list.set(1,"go");
        for(String a : list){
            System.out.println(a);
        }

    }
}
