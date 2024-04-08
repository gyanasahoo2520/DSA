package DSA1.ArrayDS.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class IterationOnHashmap {
    public static void main(String[] args) {
        //for referring all types of iteration method go through "StackOverflow"
      //https://stackoverflow.com/questions/1066589/iterate-through-a-hashmap
        HashMap<String,Integer> hm=new HashMap<>();
        //Inputs
        hm.put("India",100);
        hm.put("China",150);
        hm.put("Bhutan",10);
        hm.put("nepal",5);
        hm.put("US",50);
// keySet() - This stores only the keys into a set
        Set<String> keys=hm.keySet();
        System.out.print(keys);
        for (String k:keys){
            System.out.println("Key=" + k + " value=" + hm.get(k));
        }
    // entrySet() - This stores (key,value) pair
    // It's return type set of Map.Entry
        Set<Map.Entry<String,Integer>> values=hm.entrySet();
        System.out.println(values);

        for(Map.Entry<String, Integer> entry:values){
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " " + value);
        }
    }
}
