import java.util.Arrays;
import java.util.Stack;

public class word_compression {
    public static void main(String[] args) {
        String s="gddxxxd";
        System.out.println(word(s, 3));

    }

    static String word(String s, int k){

        int l=s.length();
        //char ch[] = new char[l];
        Stack<Character> stack = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        stack.push(s.charAt(0));
        for(int i=1;i<l; i++){
            if(stack.peek() != s.charAt(i)){
                stack.push(s.charAt(i));
                continue;
            }
            else
            {
                while(--k > 0){
                    char c=stack.pop();
                    stack2.push(c);
                    if(c != s.charAt(i)){
                        while (!stack2.isEmpty()){
                            stack.push(stack2.pop());
                        }
                        stack.push(s.charAt(i));
                        stack2.clear();
                    }
                }
                stack2.clear();
            }
        }

        return stack.toString();


    }
}
