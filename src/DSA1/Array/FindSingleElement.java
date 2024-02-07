package DSA1.Array;

public class FindSingleElement {
    public static void main(String[] args) {
        int[] arr={1,5,5,1,8,8,2};
        System.out.println(getSingleElement(arr));
    }

    static int getSingleElement(int[] arr) {
        int xor=0;
        for (int i = 0; i < arr.length; i++) {
            xor=xor ^ arr[i];
        }
        return xor;
    }
}
