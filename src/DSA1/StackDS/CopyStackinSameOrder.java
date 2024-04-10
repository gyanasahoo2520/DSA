package DSA1.StackDS;

import java.util.Scanner;
import java.util.Stack;

public class CopyStackinSameOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st=new Stack<>();
//        int n;
//        System.out.println("Enter the number of elements to insert : " );
//        n=sc.nextInt();
//        System.out.println("Enter the elements : ");
//        for(int i=0;i<n;i++){
//            int x=sc.nextInt();
//            st.push(x);
//        }
//        System.out.println(st);
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);

        //Reverse order
//        Stack<Integer> rt=new Stack<>();
//        while(st.size()>0){
////            int x=st.peek();
////            rt.push(x);
////            st.pop();
//            rt.push(st.pop());
//        }
//        System.out.println(rt);

        //Copy in same Order
        Stack<Integer> gt=new Stack<>();
        while (st.size()>0){
            gt.push(st.pop());
        }

        Stack<Integer> nt=new Stack<>();
        while (gt.size()>0){
            nt.push(gt.pop());
        }
        System.out.println(nt);
    }
}
