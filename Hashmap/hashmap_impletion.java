package Hashmap;
import java.util.*;
public class hashmap_impletion {
    public static void main(String[] args){
        HashMap<String, Integer>map = new HashMap<>();
        map.put("India",120);
        map.put("China",130);
        map.put("US",30);
        System.out.println(map);
        map.put("China",150);
        if(map.containsKey("China")){
            System.out.println("Key is present in the map ");
        }else{
            System.out.println("Key is not present in the map");
        }
//        System.out.println(map.get("China"));
//        System.out.println(map.get("Indonessia"));
        for(Map.Entry<String,Integer> e : map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
    }
}
