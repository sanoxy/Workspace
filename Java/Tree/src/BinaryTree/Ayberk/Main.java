package BinaryTree.Ayberk;

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(20);
        tree.root.left = new Node(10);
        tree.root.right = new Node(30);
        tree.root.left.left = new Node(5);
        tree.root.left.right = new Node(15);
        tree.root.right.left = new Node(25);
        tree.root.right.right = new Node(35);

        System.out.println("Preorder: ");
        tree.preorderTraversal(tree.root);

        System.out.println("\nInorder: ");
        tree.inorderTraversal(tree.root);

        System.out.println("\nPostorder: ");
        tree.postorderTraversal(tree.root);
    }
}