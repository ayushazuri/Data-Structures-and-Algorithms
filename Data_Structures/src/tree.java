import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class tree {

    static class node{
        int data;
        node left;
        node right;
        public node(int data){
            this.data = data;
            this.left=null;
            this.right=null;
        }
    }
    public static void main(String[] args) {
        node x=new node(15);
        x.left = new node(10);
        x.right = new node(20);
        x.left.left = new node(9);
        x.left.right = new node(11);
        x.left.right.left = new node(11);
        x.left.left.left = new node(6);
        x.right.right = new node(25);
        x.right.left = new node(44);
        System.out.println(count(x));
        System.out.println(ht(x));
        preorder(x);
        x=mirror(x);
        preorder(x);
        System.out.println();
        x=mirror(x);
        preorder(x);
        reverseLevelOrder(x);
        leftView(x);
    }

    static int count(node root){
        if(root == null)
            return 0;
        if(root.left == null && root.right ==null)
            return 0;
        if(root.left ==null || root.right ==null)
            return 0;

        return 1+ count(root.left) + count(root.right);
    }

    static int ht(node root){
        if(root==null)
            return 0;
        // if(root.left==null && root.right==null)
        //     return 0;
        return 1+Math.max(ht(root.left), ht(root.right));
    }
    static void preorder(node root){
        if(root!=null){
            System.out.print(root.data+ " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    static node mirror(node root){
        if(root == null)
            return null;

        node Left = mirror(root.left);
        node Right = mirror(root.right);

        root.right = Left;
        root.left = Right;

        return root;
    }

    static void reverseLevelOrder(node root) {
        Queue<node> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        queue.add(root);
        node temp;
        while (!queue.isEmpty()) {
            temp = queue.poll();
            stack.push(temp.data);
            //System.out.print(temp.data + " ");
            if (temp.right != null) {
                queue.add(temp.right);
            }
            if (temp.left != null) {
                queue.add(temp.left);
            }

        }
        System.out.println();
        while(!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }
    }

    static void leftView(node root) {
        Queue<node> queue = new LinkedList<>();
        queue.add(root);
        node temp;
        System.out.println();
        while (!queue.isEmpty()) {
            int size=queue.size();
            int i=0;
            while(i++ < size) {
                temp = queue.poll();
                if(i==1)
                    System.out.print(temp.data + " ");
                if (temp.left != null) {
                    queue.add(temp.left);
                }
                if (temp.right != null) {
                    queue.add(temp.right);
                }
            }

        }
    }

}


