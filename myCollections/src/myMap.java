import java.util.*;

public class myMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Ayush");
        map.put(3, "Sanskriti");
        map.put(8, "Oshin");
        map.put(6, "Harsh");
        map.put(4, "Pratik");
        map.put(5, "Piyush");
        map.put(7, "Ayush");

//        System.out.println(map);
//        map.putIfAbsent(3, "Singh");
//
//        for(Integer i: map.keySet())
//            System.out.print(i + " ");
//        for(String s: map.values())
//            System.out.print(s + " ");
//        System.out.println();
//        for(Map.Entry e: map.entrySet())
//            System.out.println(e.getKey() + " " + e.getValue());
//
//        map.replace(7, "Singh");
//        map.replace(2, "Ayush", "singh");
//        map.forEach((k,v) -> System.out.println(k + " " + v));
//        map.remove(5);
//        map.remove(7, "Singh");
//        map.forEach((k,v) -> System.out.println(k + " " + v));

//        TreeMap<Integer, String> tree = new TreeMap<>(map);
//        System.out.println(tree);
//
//        System.out.println(tree.ceilingEntry(2));
//        System.out.println(tree.ceilingKey(5));
//        System.out.println(tree.floorEntry(5));
//        System.out.println(tree.floorKey(4));
//        System.out.println(tree.headMap(3, true));
//        System.out.println(tree.tailMap(4));
//
//        System.out.println(tree.descendingMap());
//        System.out.println(tree.descendingKeySet());
//
//        System.out.println(tree.higherEntry(5));
//        System.out.println(tree.firstEntry());

        TreeMap<Integer, book> tr = new TreeMap<>( (o1, o2) -> {
                return o2 - o1;
            });
        tr.put(1, new book(101, "Ayush"));
        tr.put(3, new book(213, "Oshin"));
        tr.put(2, new book(102, "Harsh"));
        tr.put(5, new book(102, "Pratik"));

        for(Map.Entry<Integer, book> e: tr.entrySet()){
            System.out.println(e.getKey()+ " " + e.getValue().id + " " + e.getValue().name);
        }
    }
}

class book{
    int id;
    String name;
    book(int id, String name){
        this.id = id;
        this.name = name;
    }


}