package Array.home_Work;

import java.util.ArrayList;
import java.util.Arrays;

public class ConverteArrayList {
    public static void main(String[] args){
        String[] arr = {"A","B","C"};

        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
        System.out.println(list);
    }
}
