package BalancedTree;

public class BinaryTree {
    Node root;

    boolean isBalanced(Node root, Height height){
        if(root == null){
            height.height = 0;
            return true;
        }

        Height leftHeight = new Height(), rightHeight = new Height();
        boolean isLeftBalanced = isBalanced(root.left,leftHeight);
        boolean isRightBalanced = isBalanced(root.right,rightHeight);
        int lHeight = leftHeight.height, rHeight = rightHeight.height;

        height.height = (lHeight > rHeight ? lHeight:rHeight)+1;

//        if((lHeight - rHeight > 1) || (lHeight - rHeight < -1))
//            return false;
        if(Math.abs(rHeight-lHeight) > 1)
            return false;

        else{
            return isLeftBalanced && isRightBalanced;
        }
    }
}
