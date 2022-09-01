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

    // TC : O(n)
    // SC: O(log n) -> auxiliary space
    int count = 0;

    public int goodNodes(TreeNode root) {
        helper(root, Integer.MIN_VALUE);
        return count;
    }

    private void helper(TreeNode root, int max) {
        if (root == null)
            return;
        if (root.val >= max) {
            count++;
            max = root.val;
        }

        helper(root.left, max);
        helper(root.right, max);
        return;
    }
}
