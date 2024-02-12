package DSA1.Array;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr={2,6,5,8,11};
        int target=14;
        System.out.println(isPresent(arr,target));
    }
    static String isPresent(int[] a,int k){
        int l=0,r=a.length-1;
        Arrays.sort(a);
        while (l<r){
            int sum=a[l]+a[r];
            if (sum==k)
                return "Yes";
            else if(sum<k)
                l++;
            else
                r--;
        }
        return "No";
    }
}
