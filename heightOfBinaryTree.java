import javax.swing.tree.TreeNode;

public class heightOfBinaryTree {
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }

        int left = maxDepth(root.left);
        return Math.max(left, maxDepth(root.right)) + 1;
    }
}
