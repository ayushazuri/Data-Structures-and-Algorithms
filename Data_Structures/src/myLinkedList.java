public class myLinkedList {

    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    class stack{
        Node top;
        public void push(int data){
            Node newNode = new Node(data);
            if(top == null){
                top = newNode;
                return;
            }
            else{
                
            }


        }
    }
    Node head;
    public void add(int data){
        Node newNode = new Node(data);
        Node temp = head;
        if(head == null){
            head = newNode;
            return;
        }
        else{
            while(temp.next != null)
                temp = temp.next;

            temp.next = newNode;
        }
        //return ll;
    }
    public void add_front(int data){
        Node newNode = new Node(data);
        Node temp = head;
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
        //return ll;
    }
    public myLinkedList add_between(myLinkedList ll, int loc, int data){
        Node newNode = new Node(data);
        Node temp = ll.head;
        if(ll.head == null){
            ll.head = newNode;
            return ll;
        }

        for(int i = 1;i<loc ;i++){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        return ll;
    }

    public void del_front(){
        if(head == null)
            return;
        head = head.next;
        //return ll;
    }
    public void del(){
        Node temp = head;
        if(head == null)
            return;
        if(head.next == null){
            return;
        }

        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        //return ll;
    }

    public int remove(){
        if(head == null){
            return -1;
        }
        int x = head.data;
        head = head.next;
        return x;
    }

    public void peek(){
        if(head == null){
            System.out.println("Nothing is present in the List");
            return ;
        }

        System.out.println(head.data);
    }

    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        myLinkedList ll = new myLinkedList();
        //myLinkedList.Node head = ll.new Node(11);
        //Node head = new Node();
        ll.add(11);
        ll.add(22);
        ll.add(33);
        ll.add(44);
        ll.print();
        System.out.println(ll.remove());
        //System.out.println(ll.remove(ll));
        ll.add_front(66);
        //ll.peek(ll);
        ll.print();
    }

}
