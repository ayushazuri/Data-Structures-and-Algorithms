package Heap;

import java.util.PriorityQueue;
import java.util.Stack;

public class KLargestElements {
    public static void main(String[] args) {
        int a[] = {7, 1, 3, 5, 6, 24, 65, 2, 34, 21};
        int k = 4;
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i: a){
            pq.add(i);
            if(pq.size() > k)
                pq.poll();
        }
        Stack<Integer> stack = new Stack<>();

        while(!pq.isEmpty())
            stack.push(pq.poll());

        while (!stack.isEmpty())
            System.out.println(stack.pop());
    }
}
