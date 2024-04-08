package DSA1.ArrayDS.HashMap;

import java.util.HashMap;

public class Introd {
    public static void main(String[] args) {
        HashMap<String,Integer> hm=new HashMap<>();
        //Inputs
        hm.put("India",100);
        hm.put("China",150);
        hm.put("Bhutan",10);
        hm.put("nepal",5);
        hm.put("US",50);

        System.out.println(hm);

        // for fetching a value of a particular key
//        System.out.println(hm.get("India"));
//        System.out.println(hm.get("Canada"));//as it is not present in the map so it returns null
//
//        // checking a key is present or not
//        System.out.println(hm.containsKey("India"));
//        System.out.println(hm.containsKey("Indonesia"));
//
//        // deleting a particular node from map
//        System.out.println(hm.remove("China"));//It returns the corresponding value of that key
//        System.out.println(hm.remove("Qatar"));//it returns null as it not present in the map and doesn't affect the map
//        System.out.println(hm);

        // Size
        System.out.println(hm.size());

        // for deleting all nodes from map
        hm.clear();
        System.out.println(hm);// empty set

        //for checking a map is empty or not
        System.out.println(hm.isEmpty());


    }
}
