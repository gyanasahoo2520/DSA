package DSA1.ArrayDS.HashMap;

import java.util.HashMap;
import java.util.TreeMap;

public class Treemap {
    public static void main(String[] args) {
        // treeMap is same as HashMap
        // keys are sorted
        //Internal Implementation is "RedBlack Tree"
        TreeMap<String,Integer> tm=new TreeMap<>();
        tm.put("India",100);
        tm.put("China",150);
        tm.put("US",50);
        tm.put("Canada",10);

        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("India",100);
        hm.put("China",150);
        hm.put("US",50);
        hm.put("Canada",10);

        System.out.println(tm);
        System.out.println(hm);
    }
}
