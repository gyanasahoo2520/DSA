package DSA1.StackDS;

public class LLImplementation {
    public static class Node{
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }
    public static class StackL{
        private Node head=null;
        private int size=0;
        void push(int x){
            Node temp=new Node(x);
            temp.next=head;
            head=temp;
            size++;
        }
        void displayRec(Node h){
            if(h==null) return;
            displayRec(h.next);
            System.out.print(h.val+" ");
        }
        void display(){
            displayRec(head);
            System.out.println();
        }
        void displayRev(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp=temp.next;
            }
            System.out.println();
        }
        int size(){
            return size;
        }
        int pop(){
            if(isEmpty()){
                System.out.println("Stack is Empty");
                return -1;
            }
            int top=head.val;
            head=head.next;
            size--;
            return top;
        }
        int peek(){
            if(isEmpty()){
                System.out.println("Stack is Empty");
                return -1;
            }
            return head.val;
        }
        boolean isEmpty(){
            return size==0;
        }
    }
    public static void main(String[] args) {
        StackL st=new StackL();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.display();
        st.pop();
        st.pop();
//        System.out.println(st.pop());
//        st.display();
//        System.out.println(st.peek());
//        System.out.println(st.size());

    }
}
