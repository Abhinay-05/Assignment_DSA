import javax.swing.tree.TreeNode;

public class symmetricTree {
    class Solution {
    public boolean isSymmetric(TreeNode root) {
        return symmetric(root.left, root.right);
    }

    private boolean symmetric(TreeNode l, TreeNode r){
        if(l == r){
            return true;
        }
        if((l == null && r != null)||(l != null && r == null)||(l.val != r.val)){
            return false;
        }

        boolean left = symmetric(l.left, r. right);
        if(!left){
            return left;
        }
        return left & symmetric(l.right, r.left);
    }
}
}
