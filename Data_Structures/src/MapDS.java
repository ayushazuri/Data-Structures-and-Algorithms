import java.util.*;

public class MapDS {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("one", 1);
        map.put("two", 2);
        map.put("five", 5);

        map.put("one", 10);
        map.put("four", 1);
        map.put("six", 1);
        System.out.println(map);
        System.out.println(map.get("five"));
        map.putIfAbsent("one", 11);
        System.out.println(map);
        System.out.println(map.containsKey("two"));
        System.out.println(map.containsValue(5));

        map.replace("two", 3);
        System.out.println(map.get("two"));

        map.replace("two", 2,5);
        System.out.println(map.get("two"));
        map.replace("two" , 3, 5);
        System.out.println(map.get("two"));

        System.out.println(map.entrySet());
        System.out.println(map.keySet());
        System.out.println(map.values());
        map.remove("six");
        System.out.println(map);
        map.remove("one", 2);
        System.out.println(map);
        map.remove("one", 10);
        System.out.println(map);

        Set<Map.Entry<String, Integer>> ent = map.entrySet();
        for(Map.Entry<String, Integer> entries : ent)
        {
            entries.setValue(entries.getValue() * 100);
        }
        System.out.println(map.entrySet());



    }
}
