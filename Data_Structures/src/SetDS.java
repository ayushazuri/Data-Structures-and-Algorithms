import java.util.*;

public class SetDS {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(12);
        set.add(44);
        set.add(134);

        set.add(22);
        int c=0;
//        Iterator it = Itera
        for(int i: set)
        {


                if(c%2==0){
                    i=i*2;
                    System.out.println(i);
                }
                c++;

        }
        System.out.println("Set =" +set);
//
//        String s="Ayush Singh";
//        for(char ch: s.toCharArray()){
//            System.out.println(ch);
//        }
        //System.out.println(set.add(12));
//        System.out.println("Set =" +set);
//
//        Set<Integer> linkedhash = new LinkedHashSet<>();
//        linkedhash.add(12);
//        linkedhash.add(44);
//        linkedhash.add(134);
//
//        System.out.println("Linked Hast Set " +linkedhash);
//
//        TreeSet<Integer> tree = new TreeSet<>();
//        tree.add(44);
//        tree.add(232);
//        tree.add(12);
//        tree.add(33);
//        tree.add(35);
//        System.out.println("Tree ="+tree);
//
//        set.retainAll(tree);
//        System.out.println("Set =" +set);
//        System.out.println("Tree ="+tree);
//
//        set.addAll(tree);
//        System.out.println("Set =" +set);
//        System.out.println("Tree ="+tree);
//
//        set.retainAll(tree);
//        System.out.println(set.containsAll(tree));
//
//        System.out.println(tree.isEmpty());
//        System.out.println(tree.size());
//        TreeSet<Integer> s = (TreeSet<Integer>) tree.clone();
//        System.out.println("Cloned tree" +s);
//        //Set<Integer> s= set.hashCode();
//        System.out.println(set.hashCode());
//        System.out.println(set.getClass());
//
//        tree.remove(232);
//        set.remove(243);
//        linkedhash.remove(1);
//        System.out.println("Set =" +set);
//        System.out.println("Tree ="+tree);
//        System.out.println("Linked Hast Set " +linkedhash);
//
//        Object[] a = set.toArray();
//        for(Object i : a)
//        {
//            System.out.println(i);
//        }
//
//        linkedhash.clear();
//        System.out.println("Linked Hast Set " +linkedhash);
//
//        System.out.println(tree.first());
//        System.out.println(tree.last());
//        System.out.println(tree.higher(2));
//        System.out.println(tree.pollFirst());






    }
}
