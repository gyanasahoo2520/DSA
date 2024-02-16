package DSA1.Array.HashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Linkedhashmap {
    public static void main(String[] args) {
        // LinkedHashMap is same as HashMap
        // It is insertion ordered
        //Internal Implementation is DoubleLinkedList
        LinkedHashMap<String,Integer> lhm=new LinkedHashMap<>();
        lhm.put("India",100);
        lhm.put("China",150);
        lhm.put("US",50);
        lhm.put("Canada",10);

        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("India",100);
        hm.put("China",150);
        hm.put("US",50);
        hm.put("Canada",10);

        System.out.println(lhm);
        System.out.println(hm);
    }
}
