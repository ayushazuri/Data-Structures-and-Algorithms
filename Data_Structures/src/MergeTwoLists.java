public class MergeTwoLists
{
    static class Node
    {
        int data;
        Node next;
        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    static Node add(Node head, int data)
    {
        Node toadd = new Node(data);
        if(head == null)
        {
            head=toadd;
            return head;
        }
        Node temp = head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=toadd;
        return head;
    }

    static Node merge(Node head1, Node head2)
    {
        if(head1 == null)
            return head2;
        if(head2 == null)
            return head1;

        Node head3;
        if(head1.data < head2.data)
        {
            head3 = head1;
            head1=head1.next;
        }
        else
        {
            head3=head2;
            head2=head2.next;
        }
        Node temp = head3;
        while((head1 != null) && (head2 != null))
        {
            if(head1.data < head2.data)
            {
                temp.next=head1;
                head1=head1.next;
            }
            else
            {
                temp.next=head2;
                head2=head2.next;
            }
            temp=temp.next;
        }
        if(head1==null)
        {
            temp.next=head2;
        }
        if(head2==null)
        {
            temp.next=head1;
        }
        return head3;

    }
    static void print(Node head)
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        MergeTwoLists ml = new MergeTwoLists();
        Node head1=null;
        head1=ml.add(head1, 11);
        head1=ml.add(head1,33);
        head1=ml.add(head1,55);
        Node head2 = null;
        head2=ml.add(head2,22);
        head2=ml.add(head2,44);
        head2=ml.add(head2,66);
//        print(head1);
//        print(head2);
        Node head3=ml.merge(head1, head2);
        print(head3);


    }

}
