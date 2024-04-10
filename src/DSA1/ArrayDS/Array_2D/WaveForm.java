package DSA1.ArrayDS.Array_2D;
//Printing the Matrix in Wave form
public class WaveForm {
    public static void main(String[] args) {
        int[][] arr={{10,20,30,40},
                {50,60,70,80},
                {90,100,110,120},
                {130,140,150,160}};
        System.out.println("The Wave-Matrix is :");
        for (int i=0;i<4;i++){
            if(i%2==0){
                for (int j=0;j<4;j++){
                    System.out.print(arr[i][j]+" ");
                }
            }
            else
                for (int j=3;j>=0;j--){
                    System.out.print(arr[i][j]+" ");
                }
            System.out.println();
        }
    }
}
