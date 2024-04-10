package DSA1.StackDS;

import java.util.Stack;

public class reverseStack {
    public static void pushButtom(Stack<Integer> st,int num){
        Stack<Integer> rt=new Stack<>();
        while(!st.isEmpty()){
            rt.push(st.pop());
        }
        st.push(num);

        while (!rt.isEmpty()){
            st.push(rt.pop());
        }
    }
    public static void reverseSt(Stack<Integer> st){
        if(st.size()==1) return;
        int top=st.pop();
        reverseSt(st);
        pushButtom(st,top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);

        reverseSt(st);
        System.out.println(st);
//        Stack<Integer> rt = new Stack<>();
//        while(!st.isEmpty()){
//            rt.push(st.pop());
//        }
//        Stack<Integer> at = new Stack<>();
//        while(!rt.isEmpty()){
//            at.push(rt.pop());
//        }
//        while(!at.isEmpty()){
//            st.push(at.pop());
//        }
//        System.out.println(st);
    }
}
