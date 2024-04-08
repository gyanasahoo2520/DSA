package DSA1.ArrayDS.Recursion;

public class BS_recursion {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,25,56};
        int target=25;
        int start=0;
        int end=arr.length-1;
        System.out.println(search(arr,target,start,end));
    }
    static int search(int[] arr,int target,int s,int e){
        if(s>e){
            return -1;
        }
        int m=s+(e-s)/2;
        if(arr[m]==target){
            return m;
        }
        if(target<arr[m]){
            return search(arr,target,s,m-1);
        }else {
            return search(arr,target,m+1,e);
        }
    }
}
