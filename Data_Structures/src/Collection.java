import java.lang.reflect.Array;
import java.util.*;

public class Collection {
    public static void main(String[] args) {
        int a[] = {1, 2, 4, 5, 3, 2, 10, 6, 7, 12, 10};
        int b[] = { 1, 2, 4, 5, 5};
        int c[] = {1, 2};
        Integer d[] = {1, 2};
        System.out.println(Arrays.toString(a));
        Arrays.parallelSort(a, 2, 5);
        System.out.println(Arrays.toString(a));
        List<Integer> l = Arrays.asList(d);
        System.out.println(l);

        Set<Integer> set = new HashSet<Integer>(Arrays.asList(d));
        set.add(3);
        set.add(2);
        System.out.println(set);
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(2);
        al.add(100);
        al.add(20);
        al.add(45);
        al.add(1);

        Collections.sort(al, Collections.reverseOrder());
        System.out.println(" Sorted "+al);
        Set<Integer> set1 = new HashSet<Integer>(al);
        //Stack<Integer> s = new Stack<>(al);



        System.out.println(set);

        System.out.print(Arrays.toString(d));

//        for(int i: a){
//            System.out.println(i);
//
//        }
        System.out.println();
        System.out.println(Arrays.mismatch(a, b));
        System.out.print(Arrays.toString(a));

    }
}
