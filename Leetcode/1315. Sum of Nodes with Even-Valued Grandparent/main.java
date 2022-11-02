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

    public int sumEvenGrandparent(TreeNode root) {
        return dfs(root, null, null);
    }

    public int dfs(TreeNode root, TreeNode parent, TreeNode grandParent) {
        if (root == null) return 0;

        int ans = 0;
        if (grandParent != null && grandParent.val % 2 == 0) {
            ans += root.val;
        }

        return ans + dfs(root.left, root, parent) + dfs(root.right, root, parent);
    }
} 