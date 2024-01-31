package DSA1.Array;
//Given N array element ,count total no. of elements having at-least 1 element greater
import java.util.Scanner;

public class Array7_Greatercount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of array : ");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter the values :");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Number of element smaller : "+ Countgreater(arr));
    }
    public static int Countgreater(int[] arr){
        int max=arr[0];
        for (int i=1;i< arr.length;i++){
            if (arr[i]>max)
                max=arr[i];
        }
        int count=0;
        for (int j : arr) {
            if (j == max)
                count++;
        }
        return arr.length-count;
    }
}
