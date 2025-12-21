import javax.swing.tree.TreeNode;

public class validBST {
    /**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isValidBST(TreeNode root) {
        return validBST(root, null, null);
    }
    private boolean validBST(TreeNode root, Integer low, Integer high){
        if(root == null){
            return true;
        }
        
        if(((low != null) && (low >= root.val)) || ((high != null) && (high <= root.val))){
            return false;
        }
        
        boolean left = validBST(root.left, low, root.val);
        if(!left){
            return false;
        }

        return left & validBST(root.right, root.val, high);
    }
}
}
