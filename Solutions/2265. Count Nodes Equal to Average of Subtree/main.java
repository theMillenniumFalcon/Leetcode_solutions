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
    // SC: O(h) or O(log n), h --> height of the binary tree
    int count = 0;
    public int averageOfSubtree(TreeNode root) {
        if (root == null) {
            return count;
        }

        postOrder(root);

        return count;
    }

    public int[] postOrder(TreeNode root) {
        if (root == null) {
            // total sum, total no, of nodes
            return new int[]{0,  0};
        }

        int[] left = postOrder(root.left);
        int[] right = postOrder(root.right);

        int totalSum = left[0] + right[0] + root.val;
        int totalNodes = left[1] + right[1] + 1;

        if (totalSum / totalNodes == root.val) {
            count++;
        }

        return new int[]{totalSum, totalNodes};
    }
}