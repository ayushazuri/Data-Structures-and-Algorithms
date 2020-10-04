import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinarySearchTree {

    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    static Node insert(Node tree, int data)
    {
        //Node q = null;
        Node toadd = new Node(data);
        toadd.left=null;
        toadd.right=null;

        if(tree == null)
        {
            return toadd;
        }
        if(data > tree.data)
            tree.right = insert(tree.right, data);
        else if(data < tree.data)
            tree.left = insert(tree.left, data);
//
//        Node p = tree;
//        while(p!=null)
//        {
//            q=p;
//            if(data > p.data)
//                p=p.right;
//            else
//                p=p.left;
//
//        }
//
//        if(data > q.data)
//            q.right=toadd;
//        else
//            q.left=toadd;

        return tree;
    }

    static void inorder(Node tree) {
        if (tree != null)
        {
            inorder(tree.left);
            System.out.print(tree.data + " ");
            inorder(tree.right);
        }
    }

    static void preorder(Node tree){
        if(tree != null)
        {
            System.out.print(tree.data + " ");
            preorder(tree.left);
            preorder(tree.right);
        }
    }

    static void postorder(Node tree){
        if(tree != null){
            postorder(tree.left);
            postorder(tree.right);
            System.out.print(tree.data + " ");
        }
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


    static Node find(Node tree, int data)
    {
        while(tree != null)
        {
            if(tree.data == data)
                return tree;

            if(data < tree.data)
            {
                tree = tree.left;
            }
            else
            {
                tree = tree.right;
            }
        }
        return null;
    }


    static Node create(Node tree)
    {
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
    static int count(Node tree)
    {
        if(tree ==null)
            return 0;

        int l=0;
        l = 1 + count(tree.left) + count(tree.right);

        return l;
    }
    static Node delete(Node tree, int data)
    {
        Node temp = null;
        if(tree == null)
        {
            //System.out.println("Nothing present");
            return tree;
        }

        if(data > tree.data)
        {
            tree.right = delete(tree.right, data);
            return tree;
        }
        if(data < tree.data)
        {
            tree.left = delete(tree.left, data);
            return tree;
        }

        if(tree.left==null && tree.right==null)
        {
            temp = tree;
            return null;
        }

        if(tree.left == null)
        {
            temp = tree;
            tree=tree.right;
            return tree;
        }
        if(tree.right == null)
        {
            temp = tree;
            tree=tree.left;
            return tree;
        }

        temp = find_min(tree.right);
        tree.data = temp.data;
        tree.right=delete(tree.right, temp.data);
        return tree;
    }

    static Node find_min(Node tree){
        while(tree.left!=null)
        {
            tree=tree.left;
        }
        return tree;
    }

    static int height(Node tree)
    {
        int h1, h2;
        if(tree == null)
            return 0;

        h1 = height(tree.left);
        h2 = height(tree.right);


        return 1 + Math.max(h1, h2);
    }

    static int width(Node tree)
    {
        if(tree == null)
            return 0;

        Queue<Node> queue = new LinkedList<>();
        queue.add(tree);
        Node temp;
        int maxwidth = Integer.MIN_VALUE;
        while(!queue.isEmpty())
        {
            int count = queue.size();
            maxwidth = Math.max(maxwidth, count);
            while(count-- >  0) {
                temp = queue.poll();
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
        return maxwidth;
    }
    public static void main(String[] args) {
        Node tree=null;

        tree=create(tree);

        System.out.println("\nPreorder Traversal :");
        preorder(tree);
        System.out.println("\ninorder Traversal :");
        inorder(tree);
        System.out.println("\nPostorder Traversal :");
        postorder(tree);
        System.out.println("\nLevelOrder Traversal :");
        levelOrder(tree);
        System.out.println();
        System.out.println("Number of nodes = " + count(tree));
        System.out.println("Height of the tree is = " + height(tree));
        System.out.println("Width of the tree is = " + width(tree));
        //tree=delete(tree,7);
        //System.out.println("\nLevelOrder Traversal :");
        //levelOrder(tree);

    }



}
