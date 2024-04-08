package DSA1.ArrayDS.Recursion;

public class DigitProduct {
    public static void main(String[] args) {
        int ans=sumofDigit(1342);
        System.out.println(ans);
    }
    static int sumofDigit(int n){
        if(n%10 == n)
            return n;
        return n%10 * sumofDigit(n/10);
    }
}
