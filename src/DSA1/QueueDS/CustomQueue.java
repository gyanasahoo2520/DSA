package DSA1.QueueDS;

public class CustomQueue {
    public static class QueueA{
        int r=-1;
        int f=-1;
        int size=0;
        int[] arr=new int[10];
        public void add(int val){
            if(r==arr.length-1){
                System.out.println("Queue is Full !");
                return;
            }
            if(f==-1){
                r=f=0;
                arr[r]=val;
            }else {
                arr[++r]=val;
            }
            size++;
        }
        public int remove(){
            if(size==0){
                System.out.println("Queue is Empty !");
                return -1;
            }
            f++;
            size--;
            return arr[f-1];
        }
        public int peek(){
            if(size==0){
                System.out.println("Queue is Empty !");
                return -1;
            }
            return arr[f];
        }
        public boolean isEmpty(){
            return size==0;
        }
        public void display(){
            if(size==0){
                System.out.println("Queue is Empty !");
            }
            else {
                for (int i=f;i<=r;i++){
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        QueueA q=new QueueA();
        q.display();
        System.out.println(q.isEmpty());
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.display();
        System.out.println(q.peek());
        q.remove();
        q.display();
        System.out.println(q.size);
        System.out.println(q.remove());
    }
}
