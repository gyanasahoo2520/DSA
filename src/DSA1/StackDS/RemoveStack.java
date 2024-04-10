package DSA1.StackDS;

import java.util.Stack;

public class RemoveStack {
    public static void removeButtom(Stack<Integer> st){
        Stack<Integer> rt=new Stack<>();
        while(st.size()>1){
            rt.push(st.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        removeButtom(st);
    }
}
