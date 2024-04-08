package DSA1.ArrayDS.Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr= {3,1,5,4,2};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int arr[]){
        boolean swap;
        //run the steps n-1 times
        for(int i=0;i<arr.length-1;i++){
            swap=false;
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swap=true;
                }
            }
            if(!swap){
                break;
            }
        }
    }
}
