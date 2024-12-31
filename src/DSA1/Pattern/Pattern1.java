package DSA1.Pattern;
/* pattern1
        *
        * *
        * * *
        * * * *
        * * * * *
*/


public class Pattern1 {
    public static void main(String[] args) {
//        pattern1(5);
//        pattern2(5);
//        pattern3(5);
//        pattern4(5);
        pattern5(5);
//        pattern6(5);

    }
    static void pattern1(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

/*   pattern2
     * * * * *
     * * * *
     * * *
     * *
     *

*/

    static void pattern2(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n-row+1;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

/*   pattern3
              1
              1 2
              1 2 3
              1 2 3 4
              1 2 3 4 5

*/
    static void pattern3(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
/*   pattern4
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
    static void pattern4(int n){
        int totalRow=2*n-1;
        for(int row=1;row<=totalRow;row++){
//            int totalCol=row>n?2*n-row:row;
            int totalCol=row>n?n-row%n:row;
            for(int col=0;col<totalCol;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
/*   pattern5
    Diamond

 */

    static void pattern5(int n){
        int totalRow=2*n-1;
        for(int row=1;row<=totalRow;row++){
            int totalCol=row>n?totalRow-row+1:row;
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

/* pattern 6
     * * * * *
     * * * * *
     * * * * *
     * * * * *
     * * * * *
*/
    static void pattern6(int n) {
        for (int row = 1; row <=n ; row++) {

            for (int col = 1; col <=n ; col++) {
                System.out.print("* ");

            }
            System.out.println();

        }
    }
}
