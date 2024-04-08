package DSA1.ArrayDS.HashMap;

import java.util.HashSet;

public class DistinctElement {
    public static void main(String[] args) {
        int[] num={4,3,2,5,6,7,3,4,2,1};
        HashSet<Integer> nums=new HashSet<>();

        for (int i :  num){
            nums.add(i);
        }
        System.out.println("Answer = "+nums.size());
    }
}
