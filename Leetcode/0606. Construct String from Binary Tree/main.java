public class main {
    public static void main(String[] args) {

    }

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

    // TC: O(n)
    // SC: O(log(n)) -> auxiliary space
    String res = "";

    public String tree2str(TreeNode root) {
        helper(root);

        return res;
    }

    public void helper(TreeNode root) {
        if (root.left == null && root.right == null) {
            res += root.val;
            return;
        }
        res += root.val;
        if (root.left != null) {
            res += "(";
            helper(root.left);
            res += ")";
        }
        if (root.left == null && root.right != null) {
            res += "()";
        }
        if (root.right != null) {
            res += "(";
            helper(root.right);
            res += ")";
        }
    }
}
