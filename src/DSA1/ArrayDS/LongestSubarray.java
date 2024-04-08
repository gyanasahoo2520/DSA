package DSA1.ArrayDS;
// Only useful for positive numbers;

public class LongestSubarray {
    public static void main(String[] args) {
        int[] arr={1,2,3,1,1,1,1,3,3};
        int k=6;
        System.out.println(getLongSubarray(arr,k));
    }
    static int getLongSubarray(int[] arr,int k){
        int n=arr.length;
        int l=0,r=0;
        int maxLen=0;
        int sum=arr[0];
        while(r<n){
            if(l<=r && sum>k){
                sum=sum-arr[l];
                l++;
            }
            if(sum==k){
                maxLen=Math.max(maxLen,r-l+1);
            }
            r++;
            if(r<n)
                sum+=arr[r];
        }
        return maxLen;
    }
}
