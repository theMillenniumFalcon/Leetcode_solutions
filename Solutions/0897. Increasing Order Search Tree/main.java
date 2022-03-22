import java.util.ArrayList;

public class main {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {
        
    }

    TreeNode current = null;

    public TreeNode increasingBST(TreeNode root) {
        if (root == null) return null;

        TreeNode result = new TreeNode(0);
        current = result;

        inOrder(root);

        return result.right;
    }

    public void inOrder(TreeNode node) {
        if (node == null) return;

        inOrder(node.left);
        
        node.left = null;
        current.right = node;
        current = node;
        
        inOrder(node.right);
    }
}  