package DSA1.Array;

public class ConsecutiveOnesCount {
    public static void main(String[] args) {
        int[] arr={1,1,0,0,1,1,1,1,0,1,0};
        System.out.println(maxConsecutiveOne(arr));
    }
    static int maxConsecutiveOne(int[] a){
        int max=0;
        int count=0;
        for(int i=0;i<a.length;i++){
            if(a[i] == 1){
                count++;
            }else{
                count=0;
            }
            max=Math.max(max,count);
        }
        return max;
    }
}
