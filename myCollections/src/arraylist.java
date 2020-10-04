import java.awt.image.AreaAveragingScaleFilter;
import java.lang.reflect.Array;
import java.util.*;

public class arraylist {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        al.add(11);
        al.add(22);
        al.add(33);
        al.add(44);
        al.add(55);
        al.add(66);
        al.add(77);
        al.add(88);
        al.add(99);
        al.add(101);
        al.add(11);
        al.forEach(a -> System.out.print(a + " "));
        System.out.println();
        System.out.println(al.indexOf(11));
        System.out.println(al.lastIndexOf(11));
        al.set(5, 11);
        al.add(2, 25);
        al.forEach(a -> System.out.print(a + " "));
        System.out.println();
        al.remove(11);
        al.remove(4);
        al.removeIf(n -> n>100);
        al.forEach(a -> System.out.print(a + " "));
        System.out.println();
        ArrayList<Integer> al2 = new ArrayList<>();
        al2.add(11);
        al2.add(1012);
        al2.add(99);
        al2.addAll(al2);
        al.forEach(a -> System.out.print(a + " "));
        System.out.println();
        System.out.println(al.containsAll(al2));
        System.out.println(al.hashCode());
        System.out.println(al.equals(al2));
        //al.removeAll(al2);
        al.forEach(a -> System.out.print(a + " "));
        System.out.println();
        System.out.println(al.subList(2, 8));
        Collections.sort(al, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        Iterator it = al.iterator();
        while (it.hasNext()){
            System.out.print(it.next() + " ");
        }
        Set<Integer> set = new HashSet<>();
        set.add(22);
        set.add(33);
        ArrayList<Integer> aw = new ArrayList<>(set);
        System.out.println();
        aw.forEach(a -> System.out.print(a + " "));
        Integer arr[] = new Integer[aw.size()];
        aw.toArray(arr);
        for(int i=0;i<arr.length;i++)
            System.out.println(" assad" + arr[i]);
        HashSet<Integer> hs = new HashSet<>();

    }
}
