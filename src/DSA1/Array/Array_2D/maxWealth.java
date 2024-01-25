package DSA1.Array.Array_2D;
// Richest customer wealth

public class maxWealth {
    public static void main(String[] args) {
        int[][] arr={
            {1,5},
            {7,3},
            {3,5}
        };
        int max=maximumWealth(arr);
        System.out.println(max);
    }
    static int maximumWealth(int[][] a){
        int ans=Integer.MIN_VALUE;
        for(int r=0;r<a.length;r++){
            int sum=0;
            for(int c=0;c<a[r].length;c++){
                sum+=a[r][c];
            }
            if(sum>ans){
                ans=sum;
            }
        }
        return ans;
    }
}
