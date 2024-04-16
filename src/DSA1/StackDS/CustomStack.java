package DSA1.StackDS;

public class CustomStack {
    public static class StackA{
        private int[] arr=new int[5];
        private int index=0;
        void push(int x){
            if(isFull()){
                System.out.println("Stack is Full");
                return;
            }
            arr[index]=x;
            index++;
        }
        int peek(){
            if(isEmpty()){
                System.out.println("Stack is Empty");
                return -1;
            }
            return arr[index-1];
        }
        int pop(){
            if(isEmpty()){
                System.out.println("Stack is Empty");
                return -1;
            }
            int top=arr[index-1];
            arr[index-1]=0;
            index--;
            return top;
        }
        void display(){
            if(isEmpty()){
                System.out.println("Stack is Empty");
            }
            for (int i=0;i<index;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        int size(){
            return index;
        }
        int capacity(){
            return arr.length;
        }
        boolean isFull(){
            return index== arr.length;
        }
        boolean isEmpty(){
            return index==0;
        }
    }

    public static void main(String[] args) {
        StackA st=new StackA();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.display();
//        st.push(1);
//        System.out.println(st.isFull());
//        st.pop();
//        st.display();
//        System.out.println(st.pop());
//        System.out.println(st.isEmpty());
//
//        System.out.println(st.isEmpty());
//        System.out.println(st.size());
//        System.out.println(st.peek());
//        st.display();
//        st.pop();
//        st.pop();
//        st.pop();
//        st.pop();
//        System.out.println(st.peek());
//        System.out.println(st.capacity());
    }
}
