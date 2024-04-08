package DSA1.ArrayDS;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> array=new ArrayList<>(5);
        array.add(1);
        array.add(76);
        array.add(24);
        array.add(15);
        array.add(67);
//        System.out.println(array);
        //removing an element present at particular index
//        array.remove(1);
//        System.out.println(array);
        //for changing an element present at particular index
//        array.set(1,23);
//        System.out.println(array);
        //adding a new element at a particular index
//        array.add(1,54);
//        System.out.println(array);

        //removing an element by its name
//        array.remove(Integer.valueOf(76));
//        System.out.println(array);

        // for removing all element from collection
//        array.clear();
//        System.out.println(array);
        //for iterating through the collection

        //method 1 : For Loop
        for (int i = 0; i < array.size(); i++) {
//            System.out.print(array.get(i) + " ");
        }
        System.out.println();
        //Method 2 : for-each loop
        for(Integer num:array){
//            System.out.print(num + " ");
            }

        System.out.println();
        //Method-3 : Iterator method
        Iterator<Integer> ans=array.iterator();
        while(ans.hasNext()){
            System.out.print(ans.next() + " ");
        }

//        System.out.println("Enter the Elements : ");
//        //input
//        for (int i = 0; i < 5; i++) {
//            array.add(sc.nextInt());
//        }
//
//        //get the item at any index
//        for (int i = 0; i < 5; i++) {
//            System.out.print(array.get(i)); // pass index here, list[index] syntax will not work here
//        }
    }

}
