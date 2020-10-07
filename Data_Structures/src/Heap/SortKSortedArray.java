package Heap;

import java.util.ArrayList;
import java.util.PriorityQueue;

// nlogn

public class SortKSortedArray {
    public static void main(String[] args) {
        int a[] = {6 , 5 , 3, 2, 8, 10, 9};
        int k = 4;

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        ArrayList<Integer> al = new ArrayList<>();

        for(int i: a){
            pq.add(i);
            if(pq.size() > k) {
                al.add(pq.poll());
            }
        }
        while(!pq.isEmpty())
            al.add(pq.poll());

        for(int i: al)
            System.out.println(i);
    }
}
