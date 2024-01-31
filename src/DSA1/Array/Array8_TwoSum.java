package DSA1.Array;

import java.util.Scanner;

public class Array8_TwoSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Size of array : ");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter the values :");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the value of Sum : ");
        int sum=sc.nextInt();
        boolean cont=Twosum(arr,sum);
        if(cont)
            System.out.println("Sum Present");
        else
            System.out.println("Not Present");
    }
    public static boolean Twosum(int[] arr,int sum){
        int n=arr.length;
        for (int i=0;i<n-1;i++){
            for (int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==sum)
                    return true;
            }
        }
        return false;
    }
}
