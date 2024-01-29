package DSA1.Array.Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr= {3,5,2,1,4};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertion(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j > 0; j--) {
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }else{
                    break;
                }
            }
        }
    }

    //OR this method -
//    static void insertion(int[] arr){
//        for (int i = 1; i < arr.length; i++) {
//            int key=arr[i];
//            int j=i-1;
//            while(j>=0 && key<arr[j]){
//                arr[j+1]=arr[j];
//                j--;
//            }
//            arr[j+1]=key;
//        }
//    }

}
