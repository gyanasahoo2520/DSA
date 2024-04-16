package DSA1.QueueDS;

import java.util.LinkedList;
import java.util.Queue;

public class DisplayElement {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        Queue<Integer> helper=new LinkedList<>();
        while(!queue.isEmpty()){
            System.out.print(queue.peek() + " ");
            helper.add(queue.poll());
        }
        while(!helper.isEmpty()){
            queue.add(helper.poll());
        }
    }
}
