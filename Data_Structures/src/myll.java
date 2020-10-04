public class myll {

    static class Node{
        int data;
        Node next;
        //public Node(){}
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static Node head;
    static public void add(int data){
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
        //return;
    }
    public static void add_front(int data){
        Node newNode = new Node(data);
        Node temp = head;
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
        return;
    }
    public static void add_between(int loc, int data){
        Node newNode = new Node(data);
        Node temp = head;
        if(head == null){
            head = newNode;
            return ;
        }

        for(int i = 1;i<loc ;i++){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public static void del_front(){
        if(head == null)
            return;
        head = head.next;
        //return ll;
    }
    public static void del(){
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

    public static int remove(){
        if(head == null){
            return -1;
        }
        int x = head.data;
        head = head.next;
        return x;
    }

    public static void peek(){
        if(head == null){
            System.out.println("Nothing is present in the List");
            return ;
        }

        System.out.println(head.data);
    }

    public static void print(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        myll ll = new myll();
        ll.add(11);
        ll.add(22);
        ll.add(33);
        ll.add(44);
        //ll.print();
        //System.out.println(ll.remove());
        //System.out.println(ll.remove(ll));
        ll.add_front(66);
        //ll.peek(ll);

        ll.add_between(2, 1929);
        ll.print();
    }

}

