import java.io.*;
import java.util.*;

public class MaximumElementHackerrank{

    public static void main(String[] args) {

        Stack<Long> stack = new Stack<>();
        Stack<Long> maxstack = new  Stack<>();

        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        long maxno;
        maxstack.push(Long.MIN_VALUE);
        while(n-- > 0)
        {
            switch(sc.nextInt())
            {
                case 1: long x = sc.nextLong();
                        stack.push(x);
                        maxno = maxstack.peek();
                        if(x>maxno)
                            maxstack.push(x);
                        else
                            maxstack.push(maxno);
                        break;

                case 2: stack.pop();
                        maxstack.pop();
                        break;

                case 3: System.out.println(maxstack.peek());
                        break;

                default: break;
            }

        }

    }
}