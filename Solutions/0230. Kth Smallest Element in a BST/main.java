import java.util.Stack;

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

    // TC : O(n), n -> no. of nodes
    // SC: O(1)
    int ans = 0;
    int curr = 0;
    public int kthSmallest(TreeNode root, int k) {
        helper(root, k);

        return ans;
    }

    public void helper(TreeNode root, int k) {
        if(root == null) return;
        helper(root.left, k);
        curr++;

        if (curr == k) {
            ans = root.val;
            return;
        }

        helper(root.right, k);
    }
}