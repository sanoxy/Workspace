package BinarySearchTree.Erkan;

public class BinarySearchTree {
    Node root;

    public BinarySearchTree() {
        this.root = null;
    }

    public void insert(int data) {
        root = insertData(root, data);
    }

    private Node insertData(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (data < root.data) {
            root.left = insertData(root.left, data);
        }

        else if (data> root.data){
            root.right = insertData(root.right, data);
        }

        return root;
    }
}
