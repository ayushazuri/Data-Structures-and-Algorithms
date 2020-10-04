import java.util.*;

//Java program to print all duplicate characters in a string

public class hash {
    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        String s ="geeksforgeeks";

        char[] c = s.toCharArray();

        for(char a: c){
            if(!map.containsKey(a)){
                map.put(a, 1);
            }
            else{
                map.put(a, map.get(a) + 1);
            }
        }
        System.out.println(" ");
        Set<Character> key = map.keySet();
        for(char a: key){
            if(map.get(a) > 1){
                System.out.println(a+ " " +map.get(a));
            }
        }
        System.out.println(" ");
        Set<Map.Entry<Character, Integer>> entry= map.entrySet();
        for(Map.Entry<Character, Integer> e: entry){
            if(e.getValue() > 1)
                System.out.println(e);
        }
        System.out.println(" ");
        for(Map.Entry<Character, Integer> e: map.entrySet()){
            if (e.getValue() > 1)
                System.out.println(e.getKey()+" "+e.getValue());
        }

    }
}
