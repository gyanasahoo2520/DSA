package DSA1.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> array=new ArrayList<>(5);
//        array.add(1);
//        array.add(76);
//        array.add(24);
//        array.add(15);
//        array.add(67);
//        System.out.println(array);
//        array.remove(1);
//        System.out.println(array);
//        array.set(1,23);
//        System.out.println(array);
//        array.add(1,54);
//        System.out.println(array);

        System.out.println("Enter the Elements : ");
        //input
        for (int i = 0; i < 5; i++) {
            array.add(sc.nextInt());
        }

        //get the item at any index
        for (int i = 0; i < 5; i++) {
            System.out.print(array.get(i) + " "); // pass index here, list[index] syntax will not work here
        }
    }

}
