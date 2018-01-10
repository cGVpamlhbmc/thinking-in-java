package com.demo.holding;

import java.util.*;

/**
 * Created on 2018/1/8.
 */
public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        Random random = new Random(47);
        for (int i = 0; i < 10; i++) {
            pq.offer(random.nextInt(i + 10));
        }
        QueueDemo.printQ(pq);

        List<Integer> ints = Arrays.asList(25, 22, 20, 18, 14, 9, 1, 1, 2, 3, 9, 14, 18, 21, 23, 25);
        pq = new PriorityQueue<Integer>(ints);
        QueueDemo.printQ(pq);
        pq = new PriorityQueue<Integer>(ints.size(), Collections.reverseOrder());
        pq.addAll(ints);
        QueueDemo.printQ(pq);


    }
}
