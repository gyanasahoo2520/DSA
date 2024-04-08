package DSA1.ArrayDS;
// Count number of integer contains even no. of digit

public class EvenDigitcount {
    public static void main(String[] args) {
        int[] arr={12,345,2,6,7896};
        System.out.println(findNums(arr));
        System.out.println(countDigit2(2345676));
    }

    static int findNums(int[] arr){
        int count=0;
        for(int n:arr){
            if(even(n)){
                count++;
            }
        }
        return count;
    }

    static boolean even(int n) {
        int numberOfDigit=countDigit(n);
        return numberOfDigit % 2 == 0;
    }

    static int countDigit(int n) {
        if(n==0){
            return 1;
        }
        if(n<0){
            n=n * -1;
        }
        int cnt=0;
        while(n>0){
            cnt++;
            n=n/10;
        }
        return cnt;
    }
    //Short formula for counting the number of digit
    static int countDigit2(int n) {
        if(n<0){
            n=n * -1;
        }
        return (int)(Math.log10(n))+1;
    }
}
