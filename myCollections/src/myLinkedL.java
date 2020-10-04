import java.util.*;

public class myLinkedL {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(22);
        ll.add(33);
        ll.add(43);
        ll.add(53);
        ll.add(673);
        ll.add(53);
        ll.add(33);
        ll.addFirst(11);
        ll.addLast(99);
        ll.forEach(a -> System.out.print(a + " "));
        System.out.println();
        ll.removeFirst();


        ll.removeLastOccurrence(33);
        //ll.remove();
        ll.removeLast();
        ll.forEach(a -> System.out.print(a + " "));
        System.out.println();
        System.out.println(ll.peekLast());
        ll.set(4, 444);
        System.out.println(ll.indexOf(444));
        Integer[] arr = ll.toArray(new Integer[ll.size()]);

        ListIterator<Integer> litr = ll.listIterator();
        while(litr.hasNext()){
            System.out.print(litr.nextIndex()+ " ");
            System.out.println(litr.next() + " ");
        }
        Stack<Integer> stack = new Stack<>();
        HashSet<Integer> hs = new HashSet<>(stack);

    }
}
