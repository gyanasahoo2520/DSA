package DSA1.ArrayDS;
//Reverse a part of the array
public class Array5_Reverse2 {
    public static void main(String[] args) {
        int [] arr={1,4,2,54,23,7,78,25,6,28,5};
        rev(arr);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void rev(int [] arr){
        int sp=3;
        int ep=7;
        while(sp<ep){
            int temp=arr[sp];
            arr[sp]=arr[ep];
            arr[ep]=temp;
            sp++;
            ep--;
        }
    }
}
