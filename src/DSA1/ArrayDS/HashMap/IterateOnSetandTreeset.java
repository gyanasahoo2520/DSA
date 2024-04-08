package DSA1.ArrayDS.HashMap;

import java.util.HashSet;
import java.util.TreeSet;

public class IterateOnSetandTreeset {
    public static void main(String[] args) {
        HashSet<String> cities=new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Bengaluru");
        cities.add("Noida");
        System.out.println(cities);

//        Iterator it=cities.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }

//        for (String city :cities){
//            System.out.println(city);
//        }

        //TreeSet
        //Elements are sorted in ascending Order

        TreeSet<String> ts=new TreeSet<>();
        ts.add("Delhi");
        ts.add("Mumbai");
        ts.add("Bengaluru");
        ts.add("Noida");
        System.out.println(ts);

    }
}
