package edu.katheryn_azano.EjerciciosClase;

import java.util.PriorityQueue;

public class PrioQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        pq.add (4);
        pq.add (5);
        pq.add (8);
        pq.add (-1);
        pq.add (0);
        pq.add (3);
        pq.add (2);
        System.out.println(pq);

        pq.poll();
        System.out.println(pq);
    }
}
