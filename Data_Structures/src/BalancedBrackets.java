import java.util.Stack;

public class BalancedBrackets {
    static void check(String s){
        Stack<Character> stack = new Stack<>();

        char[] sc=s.toCharArray();

        for(int i = 0;i<sc.length;i++)
        {
            if((sc[i]=='{')||(sc[i]=='(')||(sc[i]=='['))
            {

                stack.push(sc[i]);

            }
            else
            {
                if(sc[i] == ']' && !stack.isEmpty() && stack.pop() == '[')
                    continue;
                else if(sc[i] == '}' && !stack.isEmpty() && stack.pop() == '{')
                    continue;
                else if(sc[i] == ')' && !stack.isEmpty() && stack.pop() == '(')
                    continue;
                else
                {
                    System.out.println("Not Balanced");
                    return;
                }


            }

        }
        if(stack.isEmpty())
            System.out.println("Balanced");
        else
            System.out.println("Not Balanced");
    }
    static void print(Stack<Character> s)
    {
        for( char c : s)
        {
            System.out.println(c);
        }
    }
    public static void main(String[] args){
        String s = "{(([])[])[]}[]";
        check(s);
    }
}
