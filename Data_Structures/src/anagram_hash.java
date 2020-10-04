import java.util.Arrays;
import java.util.HashMap;

public class anagram_hash {
    public static void main(String[] args) {
        
        HashMap<String, Integer> map = new HashMap<>();

        String[] s= {"geeks", "learn", "for", "egeks", "ealrn", "ayush" };
        String[] s2 = { "kgees", "rof", "nrael" };

        for(String st: s){
            char c[] = st.toCharArray();
            Arrays.sort(c);
            String sorted = new String(c);

            if(!map.containsKey(sorted))
                map.put(sorted, 1);
            else
                map.put(sorted, map.get(sorted) + 1);
        }
        System.out.println(map.entrySet());
        for(String st: s2){
            char c[] = st.toCharArray();
            Arrays.sort(c);
            String sorted = new String(c);

            if(map.containsKey(sorted)){
                System.out.println(map.get(sorted));
            }
        }
    }
}
