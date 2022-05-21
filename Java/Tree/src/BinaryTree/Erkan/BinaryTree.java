package BinaryTree.Erkan;

public class BinaryTree {
    Node root;

    BinaryTree() {
        root = null;
    }

    public void preOrder(Node currentNode) {
        if (currentNode==null) return;
        System.out.print(currentNode.data + "  ");
        preOrder(currentNode.left);
        preOrder(currentNode.right);
    }

    public void inOrder(Node currentNode) {
        if(currentNode != null){
            inOrder(currentNode.left);
            System.out.print(currentNode.data + " ");
            inOrder(currentNode.right);
        }
    }

    public void postOrder(Node currentNode){
        if(currentNode != null){
            postOrder(currentNode.left);
            postOrder(currentNode.right);
            System.out.print(currentNode.data + " ");
        }
    }
}
