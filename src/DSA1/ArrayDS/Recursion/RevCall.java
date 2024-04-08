package DSA1.ArrayDS.Recursion;

public class RevCall {
    public static void main(String[] args) {
        // print 5 to 1
//        print(5);
        // print 1 to 5 when N=5
//        printRev(5);
        concept(5);
    }
    static void print(int n){
        if(n==0)
            return;
        System.out.println(n);
        print(n-1);
    }
    static void printRev(int n){
        if(n==0)
            return;
        printRev(n-1);
        System.out.println(n);
    }
    static void concept(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        //n-- vs --n
//        concept(n--);
        concept(--n);

    }
}
