import java.util.ArrayList;
import java.util.Stack;

public class Stock_Span_Problem {
    public static void main(String[] args) {
        int a[] = {100, 80, 60, 70, 60, 75, 85};
        stock_span(a);
    }

    static void stock_span(int a[]){
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> stack1 = new Stack<>();
        ArrayList<Integer> al = new ArrayList<>();

        for(int i=0;i<a.length;i++){
            if(stack.isEmpty())
                al.add(-1);

            else if(!stack.isEmpty() && stack.peek() > a[i])
                al.add(stack1.peek());
            else if(!stack.isEmpty() && stack.peek() <= a[i]){
                while(!stack.isEmpty() && stack.peek() <= a[i]){
                    stack.pop();
                    stack1.pop();
                }
                if(stack.isEmpty())
                    al.add(-1);
                else
                    al.add(stack1.peek());
            }
            stack.push(a[i]);
            stack1.push(i);
        }

        for(int i=0;i<al.size();i++){
            al.set(i, i - al.get(i));
        }
        System.out.println(al);
    }
}
