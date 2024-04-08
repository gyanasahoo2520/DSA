package DSA1.ArrayDS.HashMap;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashsetandLHS {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(4);
        set.add(2);
        set.add(1);

        System.out.println(set);

//        set.remove(2);
//        System.out.println(set.contains(2));
//        if(set.contains(2)){
//            System.out.println("set contains 2");
//        }else {
//            System.out.println("set not contains 2");
//        }

//        System.out.println(set.size());
//        set.clear();
//        System.out.println(set);
//        System.out.println(set.isEmpty());
//        System.out.println(set.size());

        HashSet<String> cities=new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Bengaluru");
        cities.add("Noida");

        System.out.println(cities);

        //LinkedHashSet

        LinkedHashSet<String> lhs=new LinkedHashSet<>();
        lhs.add("Delhi");
        lhs.add("Mumbai");
        lhs.add("Bengaluru");
        lhs.add("Noida");
        System.out.println(lhs);

//        lhs.remove("Delhi");
//        System.out.println(lhs);
    }
}
