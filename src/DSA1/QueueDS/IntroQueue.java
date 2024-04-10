package DSA1.QueueDS;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class IntroQueue {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        System.out.println(queue.peek());
        System.out.println(queue.remove());

        Deque<Integer> dq=new ArrayDeque<>();
        dq.add(10);
        dq.add(20);
        dq.addFirst(30);
        dq.addFirst(40);

        System.out.println(dq.removeFirst());
        System.out.println(dq.removeLast());
    }
}
