package BalancedTree;

public class Main {
    public static void main(String[] args) {
        Height height = new Height();
        BinaryTree tree = new BinaryTree();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.left.right.right = new Node(6);

        if(tree.isBalanced(tree.root,height))
            System.out.println("TREE IS BALANCED!");
        else
            System.out.println("TREE IS NOT BALANCED!");
    }
}
