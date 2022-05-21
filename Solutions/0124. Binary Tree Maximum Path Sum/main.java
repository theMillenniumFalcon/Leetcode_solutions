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
    // SC: O(height of tree)
    int[] res;
    public int maxPathSum(TreeNode root) {
        res = new int[1];
        res[0] = root.val;

        dfs(root);

        return res[0];
    }

    // return max path sum without split
    public int dfs(TreeNode root) {
        if (root == null) return 0;

        int leftMax = dfs(root.left);
        int rightMax = dfs(root.right);
        leftMax = Math.max(leftMax, 0);
        rightMax = Math.max(rightMax, 0);

        // compute max path sum with split
        res[0] = Math.max(0, root.val + leftMax + rightMax);

        return root.val + Math.max(leftMax, rightMax);
    }
}