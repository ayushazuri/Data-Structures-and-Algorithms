import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class AVL_Tree
{
    static class Node{
        int data;
        Node left, right;
        int ht;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    static int bf(Node tree){
        int rh, lh;
        if(tree.left == null)
            lh = 0;
        else
            lh = 1 + tree.left.ht;

        if(tree.right == null)
            rh = 0;
        else
            rh = 1 + tree.right.ht;

        return lh-rh;
    }

    static int height(Node tree){
        int rh, lh;
        if(tree.left == null)
            lh = 0;
        else
            lh = 1 + tree.left.ht;

        if(tree.right == null)
            rh = 0;
        else
            rh = 1 + tree.right.ht;

        if(lh > rh)
            return lh;
        return rh;
    }

    static Node create(Node tree){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of data");
        int n = sc.nextInt();
        int val;
        System.out.println("Enter the values");
        for(int i = 0;i<n;i++){
            val = sc.nextInt();
            tree = insert(tree, val);
        }
        return tree;
    }

    static Node insert(Node tree, int data)
    {
        Node toadd = new Node(data);
        if(tree == null){
            tree = toadd;
            toadd.left=toadd.right=null;
        }
        else
        {
            if(data > tree.data)
            {
                tree.right = insert(tree.right, data);
                if(bf(tree) == -2)
                {
                    if(data > tree.right.data)
                        tree = RR(tree);
                    else
                        tree = RL(tree);
                }
            }
            else
            {
                if(data < tree.data)
                {
                    tree.left = insert(tree.left, data);
                    if(bf(tree) == 2)
                    {
                        if(data > tree.data)
                            tree = LR(tree);
                        else
                            tree = LL(tree);
                    }
                }
            }

        }
        tree.ht=height(tree);
        return tree;
    }

    static Node rightrotate(Node currentNode)
    {
        Node newNode;
        newNode = currentNode.left;
        currentNode.left = newNode.right;
        newNode.right = currentNode;
        currentNode.ht=height(currentNode);
        newNode.ht=height(newNode);
        return newNode;
    }

    static Node leftrotate(Node currentNode)
    {
        Node newNode;
        newNode = currentNode.right;
        currentNode.right = currentNode.right.left;
        newNode.left = currentNode;
        currentNode.ht = height(currentNode);
        newNode.ht = height(newNode);
        return newNode;
    }

    static Node RR(Node tree)
    {
        tree = leftrotate(tree);
        return tree;
    }

    static Node LL(Node tree)
    {
        tree = rightrotate(tree);
        return tree;
    }

    static Node LR(Node tree)
    {
        tree.left = leftrotate(tree.left);
        tree = rightrotate(tree);
        return tree;
    }

    static Node RL(Node tree)
    {
        tree.right = rightrotate(tree.right);
        tree = leftrotate(tree);
        return tree;
    }

    static void levelOrder(Node tree){
        Queue<Node> queue = new LinkedList<>();
        queue.add(tree);
        Node temp;
        while(!queue.isEmpty())
        {
            temp = queue.poll();
            System.out.print(temp.data + " ");
            if(temp.left != null)
            {
                queue.add(temp.left);
            }
            if(temp.right != null)
            {
                queue.add(temp.right);
            }
        }
    }
    public static void main(String[] args) {
        Node tree = null;
        tree = create(tree);

        levelOrder(tree);

    }
}
