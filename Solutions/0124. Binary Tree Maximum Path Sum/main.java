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
    // SC: O(n), required for the recursive stack, in case of a skewed tree, it can be O(n)
    public int maxPathSum(TreeNode root) {
        // taken an array as cannot take a variable and pass it as a reference in java
        int[] max_value = new int[1];
        max_value[0] = Integer.MIN_VALUE;
        helper(root, max_value);

        return max_value[0];
    }

    public int helper(TreeNode node, int[] max_value) {
        if (node == null) {
            return 0;
        }

        int left = Math.max(0, helper(node.left, max_value));
        int right = Math.max(0, helper(node.right, max_value));

        max_value[0] = Math.max(max_value[0], left + right + node.val);

        return Math.max(left, right) + node.val;
    }
}