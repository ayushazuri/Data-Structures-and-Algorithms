import java.util.Scanner;
import java.util.Stack;

public class QueueUsingStack {
//    static void front(Stack<Long> stack1, Stack<Long> stack2)
//    {
//        if(stack2.isEmpty())
//        {
//            while(!stack2.isEmpty())
//            {
//                stack2.push(stack1.pop());
//            }
//        }
//        System.out.println(stack2.peek());
//    }

    public static void main(String[] args) {
        Stack<Long> stack1 = new Stack<>();
        Stack<Long> stack2 = new Stack<>();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long y,x;
        while(n>0)
        {
            switch(sc.nextInt()) {
                case 1: x = sc.nextLong();
                        stack1.push(x);
                        break;

                case 2: if (stack2.isEmpty())
                        {
                            while(!stack1.isEmpty())
                            {
                                y = stack1.pop();
                                stack2.push(y);
                            }
                        }
                        long z = stack2.pop();
                        break;

                case 3: if(stack2.isEmpty())
                        {
                            while(!stack1.isEmpty())
                            {
                                y=stack1.pop();
                                stack2.push(y);
                            }
                        }
                        System.out.println(stack2.peek());
                        break;

                default: break;

            }
            n--;

        }
    }
}
