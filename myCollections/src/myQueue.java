import java.util.*;

public class myQueue{
    public static void main(String[] args) {
        Queue<Integer> queue= new LinkedList<>();

        queue.add(12);
        queue.add(23);
        queue.add(23);
        queue.add(23);
        queue.add(23);

        System.out.println(queue.element());

        PriorityQueue<Integer> pqueue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        pqueue.add(12);
        pqueue.add(23);
        pqueue.add(23);
        pqueue.add(13);
        pqueue.add(23);

        System.out.println(pqueue.poll());
        System.out.println(pqueue.poll());

        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(12);
        deque.addFirst(1);
        deque.addFirst(132);
        deque.addFirst(13);
        System.out.println(deque.removeFirst());
        System.out.println(deque.removeFirst());
        deque.addFirst(132);
        deque.addFirst(13);
        System.out.println(deque.removeLast());




    }
}
