import java.util.HashSet;;

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

    // TC: O(n), n -> number of nodes
    // SC: O(n + log(n)), n -> for HashSet, log(n) -> auxiliary space

    int res = 0;

    public int pseudoPalindromicPaths(TreeNode root) {
        HashSet<Integer> set = new HashSet<>();
        helper(root, set);

        return res;
    }

    public void helper(TreeNode root, HashSet<Integer> set) {
        if (root == null) {
            return;
        }

        if (set.contains(root.val)) {
            set.remove(root.val);
        } else {
            set.add(root.val);
        }

        if (root.left == null && root.right == null) {
            if (set.size() <= 1)
                res++;
        }

        helper(root.left, new HashSet<>(set));
        helper(root.right, new HashSet<>(set));
    }
}
