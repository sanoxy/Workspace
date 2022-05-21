package BinarySearchTree.Ayberk;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(8);
        tree.insert(3);
        tree.insert(1);
        tree.insert(6);
        tree.insert(7);
        tree.insert(10);
        tree.insert(14);
        tree.insert(4);

        System.out.print("Inorder Traversal: ");
        tree.inorder();

        System.out.println("\n\nAfter deleting 3: ");
        tree.delete(3);

        System.out.print("Inorder Traversal: ");
        tree.inorder();
    }
}
