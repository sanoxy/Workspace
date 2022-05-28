package BinarySearchTree.Erkan;

public class BinarySearchTree {
    private Node root;

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

    void inorder(){
        inorderRec(root);
    }

    private void inorderRec(Node root) {
        if(root != null){
            inorderRec(root.left);
            System.out.print(root.data + " -> ");
            inorderRec(root.right);
        }
    }

    public void delete(int data){
        root = deleteRec(root,data);
    }

    private Node deleteRec(Node root, int data) {
        if (root == null){
            return null;
        }
        if (data < root.data){
            root.left = deleteRec(root.left,data);
        }
        else if (data > root.data){
            root.right = deleteRec(root.right,data);
        }
        else {
            if (root.left == null){
                return root.right;
            }
            else if (root.right == null){
                return root.left;
            }
            else{
                root.data = minVal(root.right);
                root.right = deleteRec(root.right, root.data);
            }
        }
        return root;
    }

    private int minVal(Node node) {
        int var = node.data;
        while (node.left != null){
            var = node.left.data;
            node = node.left;
        }
        return var;
    }
}
