package DSA1.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        System.out.print("Enter Size of array : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter the values :");
        //n == arr.length
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
//        System.out.println(arr[4]);
//        for (int i=0;i<n;i++){
//            System.out.print(arr[i]+" ");
//        }
        // Another way of printing the element of array is - Arrays.toString(array_name);
        System.out.println(Arrays.toString(arr));
        System.out.println();
        // for reading the elements in the array we use a shortcut :
        //i.e. for-each loop
        int[] a={1,2,3,4,5};
        for(int num:a){
            System.out.print(num + " ");
        }

    }
}
