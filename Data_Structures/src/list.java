import java.net.Inet4Address;
import java.util.LinkedList;
import java.util.Stack;

public class list {
    public static void main(String[] args) {
//        LinkedList<Integer> ll = new LinkedList<>();
//        ll.add(11);
//        ll.add(22);
//        ll.add(33);
//        ll.add(44);
//
//        Integer[] l = new Integer[ll.size()];
//        l = ll.toArray(l);
//        for (int i = 0; i < l.length - 1; i++) {
//
//            System.out.println(l[i] + " " + l[i + 1]);
//        }

        Stack<Integer> s = new Stack<>();
        s.push(11);
        s.push(22);
        s.push(33);
        Integer[] ss = new Integer[s.size()];
        ss = s.toArray(ss);
//        for (int i = 0; i < ss.length - 1; i++) {
//
//            System.out.println(ss[i] + " " + ss[i + 1]);
//        }

        String st = s.toString();

        for (char c : st.toCharArray()) {
            if(Character.isDigit(c))
                System.out.print(c + " ");
        }

//        String news="";
//        for(int i: s){
//            System.out.println(i);
//            news+=i+" ";
//        }
//
//        System.out.println("\n"+news);
    }
}
