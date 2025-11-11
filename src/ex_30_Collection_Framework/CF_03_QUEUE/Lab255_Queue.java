package ex_30_Collection_Framework.CF_03_QUEUE;

import java.util.PriorityQueue;

public class Lab255_Queue {

    public static void main(String[] args) {
        // Queue - 0.0001% in automation
        // FIFO - First In First Out
        PriorityQueue q = new PriorityQueue();
        q.add("Gargeya");
        q.add("Java");
        System.out.println(q); // natural sorting o/p = [Gargeya, Java]
        System.out.println(q.peek()); // Gargeya
        System.out.println(q.poll()); // Gargeya
    }
}
