package DSA1.Array;

public class Array5_Reverse {
    public static void main(String[] args) {
        int [] arr={10,20,30,40,50};
        rev(arr);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void rev(int [] arr){
        int sp=0;
        int ep=arr.length-1;
        while(sp<ep){
            int temp=arr[sp];
            arr[sp]=arr[ep];
            arr[ep]=temp;
            sp++;
            ep--;
        }
    }
}
