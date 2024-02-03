package DSA1.Pattern;
/* pattern1
        *
        * *
        * * *
        * * * *
        * * * * *
*/
/*   pattern2
         * * * * *
         * * * *
         * * *
         * *
         *
 */
/*   pattern3
          1
          1 2
          1 2 3
          1 2 3 4
          1 2 3 4 5

 *//*   pattern4
         *
         * *
         * * *
         * * * *
         * * * * *
         * * * *
         * * *
         * *
         *
 */
/*   pattern5
    Diamond
 */


public class pattern1 {
    public static void main(String[] args) {
//        Pattern1(5);
//        Pattern2(5);
//        Pattern3(5);
//        Pattern4(5);
        Pattern5(5);
    }
    static void Pattern1(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void Pattern2(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n-row+1;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void Pattern3(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
    static void Pattern4(int n){
        for(int row=0;row<2*n;row++){
            int totalCol=row>n?2*n-row:row;
            for(int col=0;col<totalCol;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void Pattern5(int n){
        for(int row=0;row<2*n;row++){
            int totalCol=row>n?2*n-row:row;
            int noOfspace=n-totalCol;
            for(int s=0;s<noOfspace;s++) {
                System.out.print(" ");
            }
            for(int col=0;col<totalCol;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
