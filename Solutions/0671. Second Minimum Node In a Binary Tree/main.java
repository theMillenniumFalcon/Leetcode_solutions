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

    int min;
    int ans = -1;

    public int findSecondMinimumValue(TreeNode root) {
        min = root.val;
        helper(root);
        return ans;
    }

    public void helper(TreeNode root) {
        if (root == null) return;

        check(root.val);
        helper(root.left);
        helper(root.right);
    }

    public void check(int x) {
        if (ans == -1 && x != min) {
            ans = x;
        } else if (x < ans && min < x) {
            ans = x;
        }
    }
}