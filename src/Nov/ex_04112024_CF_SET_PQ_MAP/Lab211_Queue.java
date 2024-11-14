package Nov.ex_04112024_CF_SET_PQ_MAP;

import java.util.PriorityQueue;

public class Lab211_Queue {
    public static void main(String[] args) {
        // Queue -- FIFO

        PriorityQueue pq = new PriorityQueue();
        pq.offer("1");
        pq.offer("2");
        pq.offer("3");
        pq.offer("4");
        pq.offer("5");
        System.out.println(pq);
        System.out.println(pq.peek()); // see the first element
        System.out.println(pq);
        System.out.println(pq.poll()); // remove the first element
        System.out.println(pq);
    }
}
