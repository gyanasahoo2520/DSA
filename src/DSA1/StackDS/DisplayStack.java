package DSA1.StackDS;

import java.util.Stack;

public class DisplayStack {
    // Display stack reverse by recursion
    public static void displayRev(Stack<Integer> st){
        if(st.isEmpty()) return;
        int x=st.pop();
        System.out.print(x + " ");
        displayRev(st);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        displayRev(st);

//        Stack<Integer> rt = new Stack<>();
//        while(!st.isEmpty()){
//            rt.push(st.pop());
//        }
//        while(!rt.isEmpty()){
//            int x=rt.pop();
//            System.out.print(x+" ");
//            st.push(x);
//        }


//        int n=st.size();
//        int[] arr=new int[n];
//        for(int i=n-1;i>=0;i--){
//            arr[i]=st.pop();
//        }
//        for(int i=0;i<n;i++){
//            System.out.print(arr[i]+" ");
//            st.push(arr[i]);
//        }
    }
}
