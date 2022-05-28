package BinarySearchTree.Ayberk;

public class BinarySearchTree {
    private Node root;

    BinarySearchTree() {
        this.root = null;
    }

    void insert(int data) {
        root = insertData(root, data);
    }

    private Node insertData(Node root, int data) {
        //Return a new node if the tree is empty
        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (data < root.data)
            root.left = insertData(root.left, data);
        else if (data > root.data)
            root.right = insertData(root.right, data);
        return root;
    }

    void inorder() {
        inorderRec(root);
    }

    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " -> ");
            inorderRec(root.right);
        }
    }

    void delete(int data) {
        root = deleteRec(root, data);
    }

    private Node deleteRec(Node root, int data) {
        if (root == null)
            return null;
        //Find the node to be deleted
        if (data < root.data)
            root.left = deleteRec(root.left, data);
        else if (data > root.data)
            root.right = deleteRec(root.right, data);
        else{
            //if the node is with one child or no child
            if(root.left == null)
                return root.right;
            else if(root.right == null)
                return root.left;

            //if the node has two children
            //Place the inorder successor in position of the node to be deleted

            root.data = minValue(root.right);
            root.right = deleteRec(root.right, root.data);
        }
        return root;
    }

    private int minValue(Node root) {
        int minV = root.data;
        while(root.left != null){
            minV = root.left.data;
            root = root.left;
        }
        return minV;
    }
}
