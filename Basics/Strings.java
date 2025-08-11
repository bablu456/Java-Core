package Basics;
import java.util.*;
public class Strings {

    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("Bablu");
        System.out.println(sb.charAt(0));
                    // changing b into d
        sb.setCharAt(0,'D');
        System.out.println(sb);
                    // inserting the extra char
        sb.insert(1,'B');
        System.out.println(sb);
                    // delete the extra D
        sb.delete(0,1);
                    // append the data
        System.out.println(sb);
        sb.append(' ');
        sb.append('k');
        System.out.println(sb.length());
        System.out.println(sb.reverse());

    }
}
