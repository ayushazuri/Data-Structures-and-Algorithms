class myQueue {

    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static Node head, rear;

    static void enqueue(int data)
    {
        Node toadd = new Node(data);
        if(head == null)
        {
            head=toadd;
            rear=toadd;
        }
        else
        {
            rear.next=toadd;
            rear=toadd;
        }
    }

    static int dequeue(){
        if(head == null)
            return 0;

        int x = head.data;
        head=head.next;
        if(head == null)
            rear = null;

        return x;
    }

    static int peek()throws Exception{
        if(head == null)
            throw new Exception("Stack is empty");
        
        return head.data;
    }

    public static void main(String[] args) throws Exception {
        enqueue(11);
        enqueue(22);
        enqueue(33);
        enqueue(44);

        System.out.println(dequeue());
        System.out.println(dequeue());
        System.out.println(peek());
        System.out.println(dequeue());
        System.out.println(dequeue());

//        Queue<Integer> queue = new LinkedList<>();
//
//        queue.add(11);
//        queue.add(22);
//        queu
    }
}
