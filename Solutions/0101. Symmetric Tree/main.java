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

    public boolean isSymmetric(TreeNode root) {
        return helper(root.left, root.right);        
    }

    public boolean helper(TreeNode left, TreeNode right) {
        if (left == null || right == null) return left == right;

        if (left.val != right.val) return false;

        return helper(left.left, right.right) && helper(left.right, right.left);
    }
}  