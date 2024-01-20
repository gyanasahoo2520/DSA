package DSA1.Array;

import java.util.Scanner;

public class Array3_Max {
    public static void main(String[] args) {
        System.out.print("Enter Size of array : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter the values :");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
//        for (int i=0;i<n-1;i++){
//            if(arr[i]>arr[i+1])
//                max=arr[i];
//            else
//                max=arr[i+1];
//            }
        for (int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Maximum Element is : "+max);
    }
}
