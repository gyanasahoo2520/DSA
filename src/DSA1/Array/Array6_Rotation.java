package DSA1.Array;

import java.util.Scanner;

public class Array6_Rotation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Size of array : ");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter the values :");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Array before rotation - ");
        for (int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("Enter the No. of Rotation : ");
        int k=sc.nextInt();
        k=k%n;
        //reverse the whole array
        reverse(arr,0,n-1);
        //reverse first k element
        reverse(arr,0,k-1);
        //reverse after kth element till last
        reverse(arr,k,n-1);
        System.out.println("Array after rotation :");
        for (int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void reverse(int arr[],int s,int e){
        int sp=s;
        int ep=e;
        while(sp<ep){
            int temp=arr[sp];
            arr[sp]=arr[ep];
            arr[ep]=temp;
            sp++;
            ep--;
        }
    }
}
