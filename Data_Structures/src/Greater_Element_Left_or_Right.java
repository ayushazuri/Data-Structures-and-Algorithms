import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Stack;

public class Greater_Element_Left_or_Right {
    public static void main(String[] args) {
        int a[] = { 1, 3, 2, 4};
        greater_to_right(a);
        greater_to_left(a);
        greater_to_rightMAP(a);
    }

    static void greater_to_rightMAP(int a[]){
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        for(Integer i: a){
            while(!stack.isEmpty() && stack.peek() < i){
                map.put(stack.pop(), i);
            }
            stack.push(i);
        }
        for(int i=0;i<a.length;i++){
            a[i] = map.getOrDefault(a[i], -1);
        }
        for(int i: a){
            System.out.print(i + " ");
        }
    }

    static void greater_to_right(int a[]){
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> al = new ArrayList<>();

        for(int i=a.length-1;i>=0;i--){

            if(stack.isEmpty())
                al.add(-1);

            else if (!stack.isEmpty() && stack.peek() > a[i])
                al.add(stack.peek());
            else if (!stack.isEmpty() && stack.peek() <= a[i]){
                while(!stack.isEmpty() && stack.peek() <= a[i])
                    stack.pop();
                if(stack.isEmpty())
                    al.add(-1);
                else
                    al.add(stack.peek());
            }

            stack.push(a[i]);
        }

        Collections.reverse(al);
        System.out.println(al);
    }

    static void greater_to_left(int a[]){
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> al = new ArrayList<>();

        for(int i=0;i<a.length;i++){
            if(stack.isEmpty())
                al.add(-1);

            else if(!stack.isEmpty() && stack.peek() > a[i])
                al.add(stack.peek());
            else if(!stack.isEmpty() && stack.peek() <= a[i]){
                while(!stack.isEmpty() && stack.peek() <= a[i]){
                    stack.pop();
                }
                if(stack.isEmpty())
                    al.add(-1);
                else
                    al.add(stack.peek());
            }
            stack.push(a[i]);
        }
        System.out.println(al);
    }

}
