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

    public boolean isUnivalTree(TreeNode root) {
        return helper(root, root.val);
    }

    public boolean helper(TreeNode root, int key) {
        if (root == null) {
            return true;
        }
        if (root.val != key) {
            return false;
        }
        return helper(root.left, key) && helper(root.right, key);
    }
}  