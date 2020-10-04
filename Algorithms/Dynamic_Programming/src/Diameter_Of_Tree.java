import javax.swing.text.MutableAttributeSet;

public class Diameter_Of_Tree {
    static Node root;
    static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
    static int res=Integer.MIN_VALUE;
    public static void main(String[] args) {
        Diameter_Of_Tree tree = new Diameter_Of_Tree();
        //Node root;
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println(diameter(root, res));
        System.out.println(res);

        //root.left = new Node(1);
    }

    static int diameter(Node root, int res){

        if(root == null)
            return 0;

        int l=diameter(root.left, res);
        int r=diameter(root.right, res);

        int temp = Math.max(l, r) + 1;
        int ans = Math.max(temp, l + r + 1);
        res = Math.max(res, ans);
        //res = ()

        return temp;
    }


}
