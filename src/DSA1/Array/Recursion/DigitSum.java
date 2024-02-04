package DSA1.Array.Recursion;

public class DigitSum {
    public static void main(String[] args) {
        int ans=sumofDigit(1342);
        System.out.println(ans);
    }
    static int sumofDigit(int n){
        if(n==0)
            return 0;
        return n%10 + sumofDigit(n/10);
    }
}
