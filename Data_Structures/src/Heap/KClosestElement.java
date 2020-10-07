package Heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KClosestElement {
    public static void main(String[] args) {
        int a[] = {5, 6, 7, 8, 9};
        int k = 3;
        int n = 7;

        PriorityQueue<Pair> pq = new PriorityQueue<Pair>(new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                return o2.getKey() - o1.getKey();
            }
        });

        for(int i: a){
            pq.add(new Pair(Math.abs(i - n), i));
            if(pq.size() > k)
                pq.poll();
        }

        while(!pq.isEmpty()){
            System.out.println(pq.poll().getValue());
        }
    }
}

class Pair{
    Integer key;
    Integer value;
    Pair(Integer key, Integer value){
        this.key = key;
        this.value = value;
    }

    public Integer getKey() {
        return key;
    }

    public void setKey(Integer key) {
        this.key = key;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}