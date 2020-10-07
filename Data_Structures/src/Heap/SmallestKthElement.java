package Heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class SmallestKthElement {
    public static void main(String[] args) {
        int a[] = {7, 1, 3, 5, 6, 24, 65, 2, 34, 21};
        int k = 4;
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        for(int i: a){
            pq.add(i);
            if(pq.size() > k)
                pq.poll();
        }

        System.out.println(pq.peek());
    }
}
