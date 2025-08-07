package Array.home_Work;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class searchElements {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list.contains(30));
        System.out.println(list.indexOf(30));
    }
}
