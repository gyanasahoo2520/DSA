package DSA1.Array.HashMap;

import java.util.HashMap;
import java.util.Set;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr={1,3,3,5,1,3,1,5,1,5};
        HashMap<Integer,Integer> hm=new HashMap<>();

//        for (int i : arr) {
//            if (hm.containsKey(i)) {
//                hm.put(i, hm.get(i) + 1);
//            } else {
//                hm.put(i, 1);
//            }
//        }
//        Set<Integer> keys=hm.keySet();
//        for(Integer k:keys){
//            if(hm.get(k) > arr.length/3){
//                System.out.println(k);
//            }
//        }
        // OR

        for(int i=0;i<arr.length;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        for(Integer key : hm.keySet()){
            if(hm.get(key) > arr.length/3){
                System.out.println(key);
            }
        }
    }
}