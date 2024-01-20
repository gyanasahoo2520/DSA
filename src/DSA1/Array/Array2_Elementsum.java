package DSA1.Array;

import java.util.Scanner;

public class Array2_Elementsum {
    public static void main(String[] args) {
        System.out.print("Enter Size of array : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter the values :");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for (int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        System.out.println("Sum of Elements : " + sum);
    }
}
