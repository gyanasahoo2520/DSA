package DSA1.ArrayDS.Recursion;

public class Fact {
    public static void main(String[] args) {
        // Factorial of a number
//        int ans=fact(5);
//        System.out.println(ans);
        // sum of first n natural number
        int Sum=sum(5);
        System.out.println(Sum);
    }
    static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*fact(n-1);
    }
    static int sum(int n){
        if(n==1){
            return 1;
        }
        return n+sum(n-1);
    }
}
