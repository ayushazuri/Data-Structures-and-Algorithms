import java.util.Set;
import java.util.TreeSet;

public class myTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(133);
        set.add(133);
        set.add(1343);
        set.add(12133);
        set.add(133);
        set.add(13323);
        set.add(14353);
        set.add(2333);
        set.add(5533);
        set.add(5433);
        set.add(6833);
        set.add(32333);
        set.forEach(a -> System.out.println(a+ " "));
        System.out.println(set.ceiling(2133));
        System.out.println(set.floor(2133));
        Set<Integer> head = set.headSet(2133);
        System.out.println(head);
        Set<Integer> tail = set.tailSet(2133);
        System.out.println(tail);
        Set<Integer> sub = set.subSet(2333, false, 12434, true);
        System.out.println(sub);
        System.out.println(set.higher(2333));
        System.out.println(set.lower(2333));
        System.out.println(set.first());
        System.out.println(set.last());
        set.remove(5533);
        System.out.println(set);
        set.pollFirst();
        set.pollLast();
        System.out.println(set);

    }
}
