import java.util.Stack;

public class MyStack
{
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static Node top;

    static void push(int data) {
        Node toadd = new Node(data);
        if(top == null)
        {
            top = toadd;
            toadd.next = null;
            return;
        }
        else
        {
            toadd.next=top;
            top = toadd;
            return;
        }
    }

    static int pop(){
        int x;
        if(top == null)
            return -1;

        x = top.data;
        top = top.next;
        return x;
    }

    static void peek() throws Exception{
        if(top == null)
        {
            throw new Exception("Stack is empty");
        }
        System.out.println(top.data);
    }

    static boolean isEmpty(){
        if(top == null)
            return true;
        return false;
    }
    static void print(){
        Node temp = top;
        while(temp != null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public static void main(String[] args) throws Exception {
//        // Using Linked List to implement stacks

//        MyStack s = new MyStack();
//        s.push(11);
//       //print();
//        s.push(22);
//        //print();
//        s.push(33);
//        //print();
//        s.push(44);
//        print();
//        System.out.println("popped value "+s.pop());
//        s.peek();
//        System.out.println(s.isEmpty());
//        print();


        // Using Stack library to implement stack
        Stack<Integer> s = new Stack<>();
        s.push(11);
        s.push(22);
        s.push(33);
        s.push(44);
        int x = s.pop();
        System.out.println("popped value "+ x);
        System.out.println(s.search(22));
        System.out.println(s.empty());
//        while(s != null)
        for( int i=0; i<s.size();i++)
            System.out.println(s.get(i));



    }
}
