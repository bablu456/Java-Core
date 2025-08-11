package Basics;
import java.util.*;
public class Reverse_String {
    public static void main(String[] args){

        StringBuilder sb = new StringBuilder("name");
        for(int i=0;i<sb.length()/2;i++){
            int back = sb.length()-1-i;
            char frontChar = sb.charAt(i);
            char backChar = sb.charAt(back);

            sb.setCharAt(frontChar, backChar);
            sb.setCharAt(backChar,frontChar);
        }
        System.out.println(sb);
    }
}
